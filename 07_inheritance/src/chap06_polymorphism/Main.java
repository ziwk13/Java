package chap06_polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Dog chi = new Chihuahua("개");
		Dog hu = new Husky("게");
		
		Person ps = new Person();
		ps.feedFood(" 소주", chi);
		ps.feedFood(" 맥주", hu);
		

	}

}
