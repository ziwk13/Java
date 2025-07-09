package chap03_custom_exception;

public class Main {

	public static void customException() throws MyException {  // customException() 메소드를 호출 한 곳으로 Mysert

		// MyException 발생 후 예외 위임
		throw new MyException("예외임");
	}
	// JVM에게 예외 처리 하기
	//	public static void main(String[] args) {
	//		cutomException();
	//	}
	// 직접 예외 처리 하기 (권장함)
	public static void main(String[] args) {  // main() 메소드를 호출 한 곳 으로  MyException 던지기.

		try {
			customException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
