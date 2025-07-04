package chap06_polymorphism;

public class Person {
	
	/*
	 * 다형성 (Polymorphism)
	 * 
	 * 1. 하나의 객체가 여러 가지 형태를 가질 수 있음을 의미 한다.
	 * 2. 자바에서는 슈퍼 클래스 타입의 참조 변수가 서브클래스의 객체를 참조 할 수 있도록 허용함 으로서 다형성을 구현 한다.
	 * 3. 다형성의 예시
	 *   1) 하나의 타입으로 여러 객체를 다루는 경우(up-casting)
	 *   2) 동일한 메소드의 호출이 다른 동작을 하는 경우 (override)
	 */

	public void feedFood(String food, Dog dog) {  // Dog dog 매개변수가 new Chihuahua() 또는 new Husky()를
		System.out.println(dog.getName() + " 에게" + food + " 줄게");
	}
}
