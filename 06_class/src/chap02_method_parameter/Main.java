package chap02_method_parameter;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	// 클래스 Parameter 타입의 객체 생성
	Parameter parameter = new Parameter();
	
	// 객체 parameter를 이용해서 메소드를 호출 한다.
	parameter.methodA();  // 매개변수(파라미터)가 없으므로 인자(Argument)를 전달하지 않는다.
	parameter.methodB(5);  // 인자 5가 매개변수 x로 전달 된다.
//	int [] numbers = {1, 2, 3};
//	parameter.methodC(numbers);
	parameter.methodC(new int[] {1, 2, 3});
	
	parameter.methodD();
	parameter.methodD(1);
	parameter.methodD(1, 2); // 매개변수 int... 타입은 가변 인자 타입이므로 전달 하는 인자의 개수를 마음 대로 조정 할 수 있다.
	
	parameter.methodE(10);
	parameter.methodE(10, 20, 30);
	
	int number = 0;
	int[] numbers = new int[3];
	parameter.methodF(number, numbers);
	System.out.println("기본 타입 number: " + number);
	System.out.println("참조 타입 numbers: " + Arrays.toString(numbers));
	
	Car car = new Car();
	parameter.methodG(car, "서울");
	parameter.methodG(car, "경주");
	parameter.methodG(new Car(), "광주");
	}

}
