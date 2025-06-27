package chap03_ex;

public class Ex02 {

	public static void main(String[] args) {

		// 정수형 변수 3개에 임의의 값을 저장한 뒤, 그 중에서 가장 큰 수를 출력하세요.

		int a = 10;
		int b = 20;
		int c = 30;

		if(a > b) {
			if(a > c) {
				System.out.println(a);    		
			} else {
				System.out.println(c);
			}
		} else {
			if(b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} 
	}
}
