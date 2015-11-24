package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*On change la visibilité de la classe en package */
 class DummyExam {
	private ArrayList<DummyQuestion> questions;
	private int goodAnswers;

	public DummyExam() {
		questions = new ArrayList<DummyQuestion>();
		goodAnswers = 0;
		addQuestions("Couleur du cheval blanc d'Henri IV ?", "blanc");
		addQuestions("L'age du capitaine?", "33");
	}

	private void addQuestions(String question, String trueAnswer) {
		questions.add(new DummyQuestion(question, trueAnswer));
	}

	@SuppressWarnings("unchecked")
	private ArrayList<DummyQuestion> getQuestions() {
		return (ArrayList<DummyQuestion>) questions.clone();
	}

	public void answer() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (DummyQuestion q : questions) {
			System.out.println(q.getQuestion());
			try {
				String s = br.readLine();
				q.setStudentAnswer(s);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	private void computeGoodAnswers() {
		for (DummyQuestion q : questions) {
			if (q.isWellAnswered())
				goodAnswers++;
		}
	}

	private double getMark() {
		return goodAnswers * 1.0 / questions.size() * 20;
	}
	
	public double finish() {
		this.computeGoodAnswers();
		return this.getMark();
	}
}
