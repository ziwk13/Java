package chap06_constructor;

/*
 * 생성자(Constructor)
 * 
 * 1. 객체(인스턴스)를 생성 할 때 호출 하는 특별한 메소드 이다.
 * 2. 오직 객체(인스턴스) 생성 할 때만 호출 할 수 있다.
 * 3. 객체 생성 키워드 new 뒤에서 생성자를 호출 한다.
 * 4. 주요 특징
 * 	 1) 생성자의 이름은 클래스의 이름과 반드시 같아야 한다.
 * 	 2) 일반 메소드와 달리 반환 타입이 존재하지 않는다.
 * 	 3) 일반 메소드 처럼 메소드 오버로딩이 가능 하다.
 */

/*
 * 디폴트 생성자(Default Constructor)
 * 
 * 1. 매개변수가 없는 생성자 이다.
 * 2. 자동 생성
 *   클래스에 생성자를 하나도 정의하지 않으면, 
 *   자바 컴파일러는 매개변수가 없고 본문이 비어있는 디폴트 생성자를 자동으로 생성 한다.
 *   예시 형태) Car() { }
 * 3. 직접 정의
 * 	 클래스에 생성자를 하나 이상 정의 하면,
 * 	 디폴트 생성자는 더 이상 자동으로 생성 되지 않는다.
 */
public class Car {

	// 클래스를 정의 할 때 "필드" > "생성자" > "메소드" 순으로 정의 한다.

	// 필드
	String model;  // String model = null;
	int price;    // int price = 0;
	Brand brand; // Brand brand = null;

	//디폴트 생성자
	Car() {
		System.out.println("생성자 Car() 호출 되었습니다.");
	}
	// 일반 생성자
	Car(String model) {
		this.model = model;
	}
	// 일반 생성자2
	Car(int price) {
		this.price = price;
	}
	// 일반 생성자3
	Car(String model, int price) {
		// this(model); -> 일반 생성자1을 호출 하는 코드 입니다. 생성자 내부에서 다른 생성자를 호출 할 때 this() 문법을 이용 한다.
		this(model); // this.model = model;
		 this.price = price;
	}
	// 일반 생성자4
	Car(String model, int price, Brand brand) {
		this(model, price);
		this.brand = brand;
	}
	// 메소드
	void printInfo() {
		if(brand != null) {
			brand.printInfo();  // Brand 클래스의 printInfo() 메소드 호출
		}
		System.out.println(model + ", " + price + "만원");
	}
}
