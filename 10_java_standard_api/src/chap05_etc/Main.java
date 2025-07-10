package chap05_etc;

import java.text.DecimalFormat;
import java.util.Optional;

public class Main {
	
	public static void decimalFormat() {
		
		/*
		 * java.text.DecimalFormat
		 * 
		 * 1. 숫자를 원하는 패턴의 문자열로 처리하는 클래스
		 * 2. 천 단위 구분 기호(,), 소수 자리수 지정, 0 채우기 등의 다양한 숫자 형식 지정에 사용 된다.
		 * 3. 주요 패턴 기호
		 *    1) 0  : 빈자리를 0 으로 채움
		 *    2) #  : 빈자리는 표시하지 않음
		 *    3) ,  : 천 단위 구분 기호
		 *    4) .  : 소수점
		 *    5) %  : 백분율 (100을 곱한 뒤 % 붙이기)
		 */
		
		// DecimalFormat 객체 생성 (패턴 없이 생성)
		DecimalFormat df = new DecimalFormat();
		
		// 패턴 적용
		df.applyPattern("0");  // 정수로 표기
		System.out.println(df.format(1234.567));  // 1235 (자동 반올림)
		
		df.applyPattern("0.00");  // 소수 이하 2자리 표기
		System.out.println(df.format(1234.567)); // 1234.57 (자동 반올림)
		
		df.applyPattern("#,##0");  // 천 단위 구분 기호 + 정수로 표기
		System.out.println(df.format(1234.567)); // 1,235
		
		df.applyPattern("#,##0.00");  // 천 단위 구분 기호 + 소수 이하 2자리 표기
		System.out.println(df.format(1234.567)); // 1,234.57
		
	}
	public static void optional() {
		
		/*
		 * java.util.Optional
		 * 
		 * 1. 값을 감싸는 컨테이너 클래스 (JDK 8 이상)
		 * 2. null이 될 수 있는 값을 감싸는 역할 이다.
		 * 3. 저장 한 값을 꺼내서 사용 할 때 null에 대한 대체가 가능 해서 NPE(NullPointerException) 발생 가능성을 줄인다.
		 * 4. 주로 메소드의 반환 타입으로 사용 한다.
		 */
		
		// 값을 감싸는 방법
		String str = "Hello";
		String strr = null;
		Optional<String> opt1 = Optional.of(str);  // null이 될 수 없는 값을 감싸는 경우 of()를 사용 한다.
		Optional<String> opt2 = Optional.ofNullable(strr); // null이 될 수 있는 값을 감싸는 경우 ofNullable()을 사용 한다.
		
		// 값을 꺼내는 방법
		System.out.println(opt1.get());  // 값이 반드시 존재 한다면 get()으로 꺼낸다.
		System.out.println(opt2.orElse("Default"));  // 값이 존재하지 않는다면 대신 "Default"를 꺼낸다.
		
		// null이 될 수 있는 값을 감싸는 Optional.ofNullable()과
		// null 대신 다른 값을 꺼내는 orElse()가 중요 하다.
		
		// null인 경우 예외 처리 하기 (java.util.NoSuchElementException 발생)
		opt2.orElseThrow();
	}

	public static void main(String[] args) {
		
//		decimalFormat();
		optional();

	}

}
