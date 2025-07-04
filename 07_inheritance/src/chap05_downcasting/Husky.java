package chap05_downcasting;

public class Husky extends Dog {

	@Override
	public void bark() {
		System.out.println("맥주 맥주 맥주");
	}
	
	public void oneShot() {
		System.out.println("찹다 찹다");
	}
}
