package chap11_Member_Address;

// 문제. 생성자를 호출하여 Member 객체를 만들고 printInfo() 메소드를 호출하여 객체의 정보를 확인하세요.

public class Main {

	public static void main(String[] args) {

		Member mb = new Member(
				new Address(" 우편 ", " 도로명 ", " 상세 "), 
				new Address(" 배송받을 우편 ", " 배송받을 도로명 ", " 배송 상세 "));
		mb.printInfo();

	}

}
