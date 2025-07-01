package chap03_method_return;

public class Return {

	/**
	 * 반환타입이 void인 경우,
	 * return; (반환값이 없는 return문)을 이용해서
	 * 메소드 실행을 중지 시킨다.
	 * @param x
	 */
	void methodA(int x) {
		if(x < 0) {  // 메소드가 실행되면 안되는 조건을 가장 먼저 작성 한다.
			return;  // 메소드 실행 중지
		}
		System.out.println("method: " + x);
	}
	/**
	 * 일반 타입의 반환값 활용하기
	 * @param x 임의의 int 값
	 * @param y 임의의 int 값
	 * @return x + y 값
	 */
	int methodB(int x, int y) {
		return x + y;  // 메소드를 호출한 곳으로 x + y 값을 반환 한다.
	}

	int[] methodC(int size) {
		return new int[size];
	}
	String methodD() {
		Car car = new Car();
		return car.getPrice() + "만원짜리 " + car.getModel();
	}
}
