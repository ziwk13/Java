package chap03_method_return;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Return ret = new Return();
		ret.methodA(-1);
		ret.methodA(0);

		System.out.println("x + y = " + ret.methodB(3, 4));
		int result = ret.methodB(5, 10);
		System.out.println("x + y = " + result);
		
		int[] numbers = ret.methodC(3);
		System.out.println(Arrays.toString(numbers));
		
		String carInfo = ret.methodD();
		System.out.println("methodD's return: " + carInfo);
	}
}
