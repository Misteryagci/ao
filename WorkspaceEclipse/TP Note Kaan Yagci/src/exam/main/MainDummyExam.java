/*On met la classe dans un autre package pour que les classes DummyAnswers,DummyExam et DummyQuestion ne soient pas visible par la classe main qui veut dire l'utilisateur */
package exam.main;

import java.util.ArrayList;

import exam.Student;

public class MainDummyExam {
	public static void main(String[] args) {
		
		Student s = new Student();
		//ArrayList<DummyQuestion> questions = exam.getQuestions(); //On obtient les questions de l'examen
		
		s.start();
		//exam.goodAnswers = questions.size(); //Après avoir répondu tous les questions de l'exam il suffit de changer le nombre des bonnes réponses avec le nombre des questions dans l'exam
		
		System.out.println("You answered " + s.finish() + " good answers!");
	}
}