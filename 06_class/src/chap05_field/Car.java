package chap05_field;

public class Car {
	
	/*
	 * 필드(Field)
	 * 
	 * 1. 클래스가 가지는 값
	 * 2. 클래스가 선언한 변수 일반 지역 변수와 구분해서 필드라고 부른다.
	 * 3. 클래스에 포함된 모든 메소드는 필드를 사용 할 수 있다.
	 * 4. 일반 지역변수와 달리 선언만 하면 자동으로 초기화 된다. (정수 - 0, boolen - false, 참조값 - null 등)
	 */
	
	// 이 model, price는 클래스 Car에서 선언했으므로 필드 이다.
	String model;  // String model = null;
	int price;  // int price = 0;
	
	// 매개변수 model, price는 메소드 setInfo에서 선언 했으므로 지역변수 이다.
	void setInfo(String model, int price) {
		
		// this
		// setInfo 메소드를 호출하는 객체(인스턴스)를 의미 한다. (참조 값)
		// 주로, 매개변수와 필드의 이름이 같을 때 이를 구분 하기 위해 필드 앞에 this를 추가 한다.
		this.model = model;  // car1.model = "Sorento";
		this.price = price;  // car1.price = 4000;
	}
	
	void printInfo() {
		System.out.println(model + ", " + price);
	}
}
