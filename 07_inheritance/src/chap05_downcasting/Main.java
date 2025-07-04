package chap05_downcasting;

/*
 * down-casting
 * 
 * 1. up-casting 되어 있는 객체(인스턴스)의 타입을 다시 서브클래스 타입으로 변환 하는 것을 의미 한다.
 * 2. up-casting 되어 있는 객체는 슈퍼클래스의 멤버만 호출 할 수 있기 때문에 경우에 따라 서브클래스 타입으로 변환이 필요 할 수 있다.
 * 3. 안전한 변환을 위해서 객체의 실제 타입 여부를 점검 하는 instanceof 연산자를 활용 할 수 있다.
 */
public class Main {

	public static void main(String[] args) {
		
		Dog chi = new Chihuahua();
		chi.bark();  // 슈퍼클래스에 bark() 메소드가 있으므로 그냥 호출 하면 된다.
		 ((Chihuahua)chi).getDrinking();  // 슈퍼클래스에 없는 getAngry() 메소드는 다시 서브클래스 타입으로 바꾼 뒤 호출 한다.
		
		 // 타입 확인 후 다운캐스팅
		 Dog sky = new Husky();
		 sky.bark();
		 if(sky instanceof Husky) { // husky 인스턴스가 실제로 Husky 타입 이라면,
			 ((Husky) sky).oneShot();  // husky.oneShot() 형식으로 입력 할 수 있다. 자동으로 다운캐스팅 코드는 완성!
			 						  // instanceof 연산자를 사용 했기 때문
		 }

	}

}
