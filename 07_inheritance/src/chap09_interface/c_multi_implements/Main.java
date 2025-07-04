package chap09_interface.c_multi_implements;

public class Main {

	public static void main(String[] args) {
		
		// Camera 타입: Camera 인터페이스의 메소드만 보인다. Phone 인터페이스의 기능은 캐스팅 해서 호출 해야 한다.
		
		Camera ph = new SmartPhone();
		((Phone)ph).call();
		
		// Phone 타입: Phone 인터페이스의 메소드만 보인다. Camera 인터페이스의 기능은 캐스팅 해서 호출 해야 한다.
		Phone iPhone = new SmartPhone();
		((Camera) iPhone).picture();
		
		// SmartPhone 타입: SmartPhone 클래스의 메소드가 모두 보인다.
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.picture();
		
		
		

	}

}
