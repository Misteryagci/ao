package exam;

/* On garde seulement la classe Student en public pour que ça puisse être la seule classe qui contrôle l'utilisateur et les classes d'examen */
public class Student {

	//La classe Student représente un(e) étudiant(e)
	//On peut y mettre des paramètres comme nom,prénom etc. mais on n'a pas besoin
	private DummyExam exam;
	
	public Student()
	{
		this.exam = new DummyExam();
	}
	
	public void start()
	{
		this.exam.answer();
	}
	
	public double finish()
	{
		return this.exam.finish();
	}
}
