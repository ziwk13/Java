package chap07_access_modifier;

import chap06_constructor.Brand;

/*
 * Access Modifier (접근 지시자)
 * 
 * 1. 클래스 내의 멤버(필드, 메소드)에 접근 할 수 있는 권한을 의미 한다.
 * 2. 종류
 * 	  1) public    : 누구나 접근 할 수 있다.
 *    2) protected : 동일 패키지에 있거나, 상속 관계인 경우 접근 할 수 있다.
 *    3) default   : 동일 패키지에 있으면 접근 할 수 있다. (default 키워드는 존재 하지 않는다. package 권한 이라고도 한다. Access Modifier가 없는 경우 defualt 권한을 가진다)
 *    4) private   : 클래스 내부에서만 접근 할 수 있다.
 * 3. 멤버의 권한
 * 	  1) 필드  : private (정보 은닉)
 *    2) 메소드: public
 *    3) 생성자: public
 */	

public class Car {

	// 필드
	private String model;
	private int price;
	private Brand brand;

	// 생성자-1
	public Car() {
		//		model = "E350";
		//		price = 8000;
		this("E350", 8000);
	}
	// 생성자-2
	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}
	// 생성자-3
	public Car(String model, int price, Brand brand) {
		this.model = model;
		this.price = price;
		this.brand = brand;
	}


	// 메소드
	public void printInfo() {
		System.out.print(model + ", " + price);
		if(brand != null) {
			brand.printInfo();
		}
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
}
