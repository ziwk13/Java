package chap07_access_modifier;

import chap06_constructor.Brand;
/*
 * import
 * 
 * 1. 다른 패키지에 있는 클래스, 인터페이스, 라이브러리 등을 현재 소스 파일에서 사용 할 수 있도록 불려오는 명령 이다.
 * 2. 동일한 패키지에 있거나, java.lang 패키지에 있으면 import를 하지 않는ek.
 * 3. 다른 패키지에 있거나, Java.long 패키지에 없는 것들은 import를 해야 한다.
 * 4. import 사용예시
 *    1) 특정 클래스 import 하기
 *      improt java.util.Arrays;
 *    2) x 특정 패키지 전체 imporet 하기
 *    import java.util.*;
 * 5.  이클립스의  imtport 정리 단축키
 *    Ctrl + Shift + O (대문자0
 */
/*
 * 캡슐화
 * 
 * 데이터(필드)와 기능(메소드)을 하나의 클래스로 묶고,
 * 데이터를 외부에서 직접 볼 수 없게 은닉하여 보호하고
 * 필요한 기능만 외부에 공개한다.
 */

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.printInfo();
		
		Car car2 = new Car("X8", 12000, new Brand("BMW", "절므니"));
		car2.printInfo();
		
		Car car3 = new Car("Sorento", 5222, new Brand("KIA", "KOREA"));
		car3.printInfo();
		
		// Geter는 필드값을 확인 할 때 사용한다.
		System.out.println(car2.getModel()); 
		System.out.println(car2.getPrice()); 
		System.out.println(car2.getBrand().getName());
		System.out.println(car2.getBrand().getNation());
		
		// Setter는 필드값을 수정 할 때 사용 한다.
		car3.setModel("소나타");
		car3.setPrice(41321);
		car3.setBrand(new Brand("현다이", "꼬레아"));
		car3.printInfo();
		
		car2.setModel("fuck");
		car2.setPrice(22);
		car2.getBrand().setName("al;kjdsadslkjasdlkj");
		car2.getBrand().setNation("adslkjadslkjdaslkj");
	}
}
