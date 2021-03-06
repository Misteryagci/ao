package exam;

/*On change la visibilité de la classe en package */
 class DummyQuestion {
	private String question;
	private DummyAnswers answers;

	public DummyQuestion(String question, String trueAnswer) {
		this.question = question;
		this.answers = new DummyAnswers(trueAnswer, null);
	}

	public String getQuestion() {
		return question;
	}

	public void setStudentAnswer(String studentAnswer) {
		if (this.answers.getStudentAnswer() == null)
			this.answers.setStudentAnswer(studentAnswer);
		else
			throw new UnsupportedOperationException("Already answered");
	}

	public boolean isWellAnswered() {
		return this.answers.getStudentAnswer().equals(this.answers.getTrueAnswer());
	}

	public DummyAnswers getAnswers() {
		if (this.answers.getStudentAnswer() != null)
			return answers;
		else
			throw new UnsupportedOperationException("Answer cannot be accessed before answered");
	}

}
