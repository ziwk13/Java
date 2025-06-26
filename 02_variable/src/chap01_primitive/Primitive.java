package chap01_primitive;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class Primitive {

	public static void main(String[] args) {
	
		/*
		 * Primitive Type
		 * 1. 기본 타입을 의미 한다.
		 * 2. 8가지 기본 타입이 있다.
		 * 3. 오직 값만 저장 하는 타입 이다.
		 * 4. 객체와 구별하기 위한 데이터 타입 이다.
		 */

		{
			// boolean
			// 논리값 (true 또는 false)
			// 1비트 (Java 명세상)
			boolean a = true;
			System.out.println(a);
		}
		{
			// 비트와 바이트
			// 1. 비트  : 0 또는 1을 저장 할 수 있는 최소 저장 단위
			// 2. 바이트: 8 비트로 구성된 메모리의 최소 저장 단위
			
			// 비트에 따른 데이터 표현 개수
			// 예시)
			// 2비트로 가능한 데이터 조합: 00, 01, 10, 11 (4개)
			// 3비트로 가능한 데이터 조합: 000, 001, 010, 011, 100, 101, 110, 111 (8개)
			// N비트로 가능한 데이터 조합: 2의 N제곱개
			
			// 비트에 따른 데이터 표현 범위 (정수 범위)
			// 예시)
			// 4비트로 가능한 데이터 범위: -8 ~ 7
			// 8비트로 가능한 데이터 범위: -128 ~ 127
			// N비트로 가능한 데이터 범위: -2의 (N-1) 제곱 ~ 2의 (N-1)제곱 -1
		}
		{
			// 정수 타입
			// 1. byte  : 1바이트 (-128 ~ 127)
			// 2. short : 2바이트 (-32768 ~ 32767)
			// 3. int   : 4바이트 (대표 정수 타입)
			// 4. long  : 8바이트
			byte a;
			short b;
			int c;
			long d;
			a = Byte.MAX_VALUE; System.out.println(a);
			b = Short.MAX_VALUE; System.out.println(b);
			c = Integer.MAX_VALUE; System.out.println(c);
			d = Long.MAX_VALUE; System.out.println(d);
			
			// long 타입 주의점 (int 범위를 벗어나는 값의 리터럴 작성 시 마지막에 l 또는 L을 추가 한다.)
			d = 2147483648L; System.out.println(d);
		}
		{
			// 실수 타입
			// 1. float : 4바이트 (약 3.4e-38 ~ 3.4e+38)
			// 2. double: 8바이트 (약 1.7e-308 ~ 1.7e+308) (대표 실수 타입)
			float a;
			double b;
			
			// float 주의사항 (리터럴 작성 시 반드시 마지막에 f 또는 F를 추가 한다.)
			a = 1.5F; System.out.println(a); // float은 사용 하지 않는다.
			b = 2.5; System.out.println(b);
		}
		{
			// char
			// 문자
			// 2바이트 (유니코드 문자: 0 ~ 65535)
			char a = '한';
			System.out.println(a);
		}
	}

}
