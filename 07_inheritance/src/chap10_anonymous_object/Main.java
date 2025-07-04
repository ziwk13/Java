package chap10_anonymous_object;

/*
 * 클래스를 이용한 익명 객체 (Anonymous Object)
 * 
 * 1. 클래스를 상속해서 이름 없는 서브클래스를 즉석에서 선언하고 객체로 생성 하는 방법
 * 2. 한 번만 사용할 목적의 임시 객체가 필요 할 때 유용 하다.
 * 3. 문법
 *    슈퍼클래스 참조변수 = new 슈퍼클래스(매개변수, ...) {
 *    @Override // 필요 시 진행
 *    void method() { ... }
 *    };
 */
/*
 * 인터페이스를 이용한 익명 객체 (Anonymous Object)
 * 
 * 1. 인터페이스(또는 추상클래스)를 구현 할 때(상속 할 때) 구현클래스를 즉석에서 선언 하고 객체로 생성 하는 방법
 * 2. 대표적으로 이벤트 처리와 같이 한 번만 처리 하는 작업에서 많이 활용 된다.
 * 3. 문법
 * 	  인터페이스 참조변수 = new 인터페이스(매개변수, ...) {
 * 	   @Override  // 필수
 * 		void method() { ... }
 *    };
 */

public class Main {

	public static void main(String[] args) {

		// 서브클래스 Chihuahua 없이 chihuahua 객체 만들기

		Dog chi = new Dog() {
			@Override
			public void bark() {
				System.out.println("ㅇㅇ");
			}
		};
		chi.bark();
		
		// 구현클래스 ConfirmButton 없이 confirmButton 객체 만들기
		
		Button bt = new Button() {
			@Override
			public void onClick() {
				System.out.println("!공습경보!");
			}
		};
		bt.onClick();
		// 메소드에 익명 객체를 인자로 전달 하기
		
		WebService.signUp(new Button() {
			@Override
			public void onClick() {
				System.out.println("회원 가입 후 이동");
			}
		});
		WebService.createPost(() -> {
			System.out.println("게시글 작성 후 이동");
		});
	}
}
