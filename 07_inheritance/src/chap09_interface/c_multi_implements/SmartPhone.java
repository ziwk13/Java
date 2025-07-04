package chap09_interface.c_multi_implements;

/*
 * 인터페이스는 다중 구현 할 수 있다.
 */

public class SmartPhone implements Camera, Phone {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화");
	}

	@Override
	public void picture() {
		// TODO Auto-generated method stub
		System.out.println("사진");
	}
}
