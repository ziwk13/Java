package chap09_interface.a_overview;

/*
 * 인터페이스 (Interface)
 * 
 * 1. 클래스들이 반드시 구현해야 하는 기능의 명세(메소드의 규칙)를 정의 하는 일종의 추상 자료형
 * 2. 추상화, 다형성 등의 핵심 개념으로 활용 된다.
 * 3. 실무적으로 보면 작업지시서 역할을 수행 할 수 있다.
 * 4. 구성 요소
 * 	  1) 상수          : 모든 필드는 public static final로 선언 된다. 생략해도 자동으로 붙는다.
 * 	  2) 추상 메소드   : 모든 메소드는 public abstract로 선언 된다. 생략 해도 자동으로 붙는다.
 * 	  3) default 메소드: JDK 8 부터 default 키워드를 추가한 본문이 있는 메소드를 정의 할 수 없다.
 *    4) 정적 메소드   : JDK 8 부터 static 메소드를 정의 할 수 있다.
 * 5. 주요 특징
 *    1) 객체(인스턴스)를 생성 할 수 없다.
 *    2) 인터페이스는 구현(implements) 한다. 상속 받는다고 표현 하지 않는다.
 *    3) 다중 구현이 가능 하다. 2개 이상의 인터페이스를 구현 할 수 있다.
 *    4) 다형성을 지원 한다. 인터페이스를 구현클래스 객체들의 타입으로 사용 할 수 있다.
 *    5) 인터페이스의 구현클래스들은 반드시 모든 추상 메소드를 오버라이드 해야 한다.
 */

/*
 * 클래스 상속과 인터페이스 구현
 * 
 * 				클래스		인터페이스
 * -----------------------------------
 * 표현         상속		구현
 * 키워드       extends 	implements
 * 하위클래스   서브클래스	구현클래스
 * 다중지원 	불가능 		가능
 */

public interface Animal {
	void move();  // 추상 메소드 (public abstract 자동 추가)
	
	default void eat() { // 디폴트 메소드 (JDK 8+)
		System.out.println("냠냠");
	}
	static void breath() {  // 정적 메소드 (JDK 8+)
		System.out.println("숨숨");
	}
}
