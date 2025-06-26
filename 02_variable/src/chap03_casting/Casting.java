package chap03_casting;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 * Promotion
		 * 
		 * 1. 데이터 타입 변환 의 한 종류 이다.
		 * 2. 별도 코드 없이 자동으로 수행 하는 타입 변환 이다.
		 * 3. 작은 데이이터 타입을 큰 데이터 타입으로 자동 변환 하는 과정을 의미 한다. (크기가 아닌)
		 * 4. 타입 변환 시 데이터 손실이 발생 하지 않는다.
		 */

		
		// 예시1) int -> long
		int i = 10;
		long l = i; // Promotion (자동 변환)
		double d = l; // Promotion (자동 변환)
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
	}

}
