package chap02_reference;

public class ReferenceEx {

	public static void main(String[] args) {
		
		/*
		 * Reference Type
		 * 1. 참조 타입 이다.
		 * 2. 값이 아니라 값이 저장된 메모리의 참조값(주소값)을 저장 하는 타입 이다.
		 * 3. 종류
		 * 	  1) 클래스 타입
		 * 	  2) 배열 타입
		 *    3) 인터페이스 타입
		 *    4) 열거 타입 등
		 */

		/*
		 * Java 메모리 구조
		 * 
		 * 1. 자바 프로그램이 실행되면 JVM(Java Virtual Machine)이 여러 메모리 영역을 사용 한다.
		 * 2. 자바 프로그램을 구성하는 모든 것(변수, 메소드, 클래스 등)들은 메모리에 저장 된다.
		 * 3. 주요 영역
		 * 	  1) 스택(Stack) 영역    : 변수가 저장 되는 영역
		 * 	  2) 힙(Heap) 영역       : 객체, 배열 등이 저장 되는 영역
		 *    3) 메소드(Method) 영역 : 클래스 정보, static 변수 등이 저장 되는 영역
		 * 4. 메모리 구조
		 * 	  1) 1바이트 마다 참조 값(주소 값)을 부여 한다.
		 * 	  2) 참조값은 16진수로 표기 한다. (0x 또는 0X로 시작 하는 숫자)
		 * 5. Java는 실제 참조 값(메모리의 주소 값)을 직접 확인 하거나 수정 할 수 없다.
		 */
		
		// 가장 대표적인 참조 타입은 문자열을 저장 하기 위한 String 클래스 타입 이다.
		
		String a = new String("Hello World");  // 변수 a : 스택 영역에 생성 된다 "Hello World"가 저장된 메모리 참조값이 변수 a에 저장 된다.
		// 자바에서는 참조값에 접근 할 수 없으므로 출력 되지 않는다. 그냥 참조 ㄱ
		System.out.println(System.identityHashCode(a)); // 참조값은 아니지만 유사한 값을 대신 확인 한다.
	}

}
