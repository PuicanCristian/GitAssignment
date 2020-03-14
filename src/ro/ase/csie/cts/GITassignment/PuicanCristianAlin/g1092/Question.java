package ro.ase.csie.cts.GITassignment.PuicanCristianAlin.g1092;

public class Question implements Topicable{
	String author;
	String content;
	
	public Question(String author, String content) {
		super();
		this.author = author;
		this.content = content;
	}

	@Override
	public void printTopic(String topic) {
		System.out.println("The question has the topic: "+topic);
	}

}
