package chap01_is_a;

public class Main {

	public static void main(String[] args) {
		
		// Student
		Student student = new Student();
		student.eat();
		student.sleep();
		student.study();
		System.out.println();
		
		// Worker
		Worker worker = new Worker();
		worker.eat();
		worker.sleep();
		worker.starWork();
		worker.finishWork();
		System.out.println();
		
		// Developer
		Developer developer = new Developer();
		developer.eat();
		developer.sleep();
		developer.develop();
		System.out.println(); 
		

	}

}
