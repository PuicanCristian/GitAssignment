package ro.ase.csie.cts.GITassignment.PuicanCristianAlin.g1092;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git! The name of the license project is Collaborative Q&A platform for education.");
		Question question = new Question("John", "What is inheritance?");
		System.out.println("Question asked by: "+question.author);
		System.out.println("Question's content: "+question.content);		
		question.printTopic("POO");
	}

}
