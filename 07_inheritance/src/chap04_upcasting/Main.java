package chap04_upcasting;

/*
 * up_casting
 * 
 * 1. 서브클래스 타입의 객체(인스턴스)를 슈퍼클래스 타입으로 변환 할 수 있다.
 * 2. 슈퍼클래스 타입으로 변환된 서브클래스 객체는 슈퍼클래스의 멤버에 접근 할 수 있다.
 * 3. 자동으로 변환 되므로 강제로 캐스팅할 필요가 없다.
 * 4. 하나의 타입(슈퍼클래스 타입)으로 여러 객체(서브클래스 타입의 객체)를 관리 할 수 있다. 
 */

public class Main {

	public static void main(String[] args) {
		
		Dog chi = new Chihuahua();
		chi.bark();  // 호출 할 땐 Dog의 bark()를 호출 하지만, 실행 할 땐 Chihuahua의 bark()가 실행 된다
		
					 // 오버라이드 된 메소드의 경우 명시적으로 작성된 타입(Dog)이 아닌
					 //실제 저장 된 객체의 타입(Chihuahua)으로 메소드가 연결 되면서(Binding) 실행 된다.
					 // 명시적 작성된 타입과 실행 하는 타입이 바뀌는 것을 "동적 바인딩(Dynamic Binding)"이라고 한다.
		
		Dog sky = new Husky();
		sky.bark();
		
		// 서로 다른 타입의 객체들을 하나의 타입으로 관리하기
		
		Dog[] dogs = new Dog[20];
		dogs[0] = new Chihuahua();
		dogs[1] = new Husky();
		for(Dog dog : dogs) {
			if(dog != null) {
				dog.bark();
			}
		}

	}

}
