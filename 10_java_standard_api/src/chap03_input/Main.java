package chap03_input;

import java.util.Scanner;

/*
 * java.util.Scanner
 * 
 * 1. 콘솔 창으로 데이터를 입력 할 때 사용 할 수 있다.
 * 2. 표준 입력 스트림(System.in)으로 부터 데이터를 입력 받을 수 있도록 Scanner 객체를 생성 한다.
 *    사용자로부터 데이터를 입력 받을 수 있다.
 * 3. 주요 메소드
 *    1) next()			   : 공백 없는 문자열 입력
 *    2) nextLine()		   : 공백 포함된 문자열 입력
 *    3) nextInt()		   : int 입력
 *    4) nextLong()        : long 입력
 *    5) nextDounble()     : double 입력
 *    6) next().charAt(0)  : char 입력
 */

public class Main {

	public static void main(String[] args) {

		// 표준 입력 스트림(키보드)으로 부터 데이터를 입력

		while(true) {

			try {
				Scanner sc = new Scanner(System.in);

				System.out.print("이름이 뭐니?");
				String name = sc.next();
				System.out.println("저는 " + name + " 입니다");

				System.out.print("나이는?");
				int age = sc.nextInt();
				System.out.println(age + " 살 입니다.");

				System.out.print("키는 몇이니?");
				double key = sc.nextDouble();
				System.out.println("그런건 왜 물어봐요? " + key);

				// 입력 리소스 사용 후 반납
				sc.close();
				break;
			} catch (Exception e) {
				System.out.println("거짓말 하려고 하지 마렴");
			}
		}
	}

}
