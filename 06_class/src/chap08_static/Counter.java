package chap08_static;

/*
 * 메모리 영역별 역할
 * 
 * 1. Stack : 메소드 호출 마다 생성 되는 메모리 영역.
 * 2. Heap  : new 명령으로 생성한 객체(인스턴스 변수), 배열 등 저장
 * 3. Method: 클래스 정보, 메소드 정보 등 메타데이터, static 변수 등 저장 
 */

/*
 * 자바 프로그램의 실행 순서
 * 
 * 1. 클래스 로딩(Loading)
 * 	  소스코드 컴파일 시 .class 파일(바이트코드)이 생성 된다.
 * 	  클래스 로더(Class Loader)가 실행에 필요한 클래스를 JVM의 Method 영역에 동적으로 로드 한다.
 * 2. 링킹(Linking)
 * 	  로드 된 클래스에 대해 검증, 준비, 해결 단계를 통해 점검 한다.
 * 3. 초기화(Initialization)
 *    static 변수에 명시된 값으로 초기화 하고, static 블록을 실행 한다.
 * 4. main() 메소드 실행
 *    main 메소드와 그 안에서 호출 되는 다른 모든 메소드는 JVM의 Stack 영역에 각각의 스택 프레임을 생성 한다.
 * 5. 인스턴스 생성
 *    new 명령으로 인스턴스를 생성 하면 해당 인스턴스를 Heap 영역에 할당
 * 6. 메소드 호출
 *    메소드 호출 정보가 스택 프레임에 쌓이고, 메소드 실행이 끝나면 해당 프레임이 제거 된다.
 * 7. 프로그램 종료
 *    main 메소드가 종료 되면 JVM이 사용 하던 메모리를 해제 한다.
 *    Heap에 남아 있는 영역은 Garbage Collector에 의해서 정리 된다.
 */

/*
 * static
 * 
 * 1. 클래스 멤버(필드, 메소드)를 정의 할 때 사용 하는 키워드
 * 2. static으로 선언된 멤버(필드, 메소드)는 객체(인스턴스)에 소속 되지 않는다.
 *    클래스 자체에 소속 된다. 그래서 클래스 멤버 라고 한다.
 * 3. static 특징
 *    1) 클래스가 메모리에 로드 될 때 한 번만 할당 되고, 프로그램이 종료 될 때 까지 유지 된다.
 *    2) 모든 객체(인스턴스)가 static 변수를 공유 한다. 여러 객체가 같은 static 변수를 접근하게 된다.
 *    3) 객체(인스턴스) 생성이 없어도 접근 할 수 있다.
 * 4. static 멤버 접근 방법
 *    1) 클래스.멤버 ( 클래스.필드 or 클래스.메소드() )
 *    2) 객체.멤버 (추천 하지 않음)
 * 5. static 메보스는 static 멤버(필드, 메소드)만 사용 할 수 있다.
 */
public class Counter {
	// 인스턴스 멤버 (인스턴스에 소속 되고, 인스턴스로 접근 한다.)
	private String name;
	
	// 클래스 멤버 (클래스에 소속 되고, 클래스로 접근 한다.)
	static int count = 0;
	
	// 인스턴스를 생성 할 때 마다 count를 증가 시킨다.
	Counter(){
		count++;
	}
	
	// static Method (static 멤버(=클래스 멤버)만 사용 할 수 이 있다.)
	public static void viewCount() {
		System.out.println("현재 Count : " + count);
	}
	
	// 인스턴스 메소드 (인스턴스 멤버와 static 멤버 모두 사용 할 수 있다.)
	public void printInfo() {
		System.out.println(name);
		System.out.println(count);
	}
}
