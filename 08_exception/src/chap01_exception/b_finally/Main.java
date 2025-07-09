package chap01_exception.b_finally;

import java.util.Arrays;

/*
 * finally 블록
 * 
 * 1. 예외 발생 여부와 상관 없이 항상 실행되는 코드를 작성 한다.
 * 2. 파일 열기, 데이터베이스 연결, 네트워크 소켓 연결 등 시스템 자원을 사용한 경우
 *    해당 자원을 finally 블록에서 닫거나 반환하는 것이 좋다.
 * 3. finally 블록에서도 예외가 발생 할 수 있으므로, 필요한 경우 finally 블록 내부에
 *    다른 try - catch 문을 사용 할 수 있다.
 * 4. finally 블록에서 return을 사용 하는 것을 권장 하지 않는다.
 *    이는 try 블록이나 catch 블록에서 처리 한 return 또는 throw가 무시 될 수 있기 때문이다.
 */
public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println(" try ");
			int[] numbers = new int[-5];  // NegativeArraySizeException 예외 발생 (음수 크기의 배열 생성 시)
			System.out.println(Arrays.toString(numbers));
		} catch (Exception e) {
			System.out.println(" catch ");
		} finally {
			System.out.println(" always finally ");
		}

	}

}
