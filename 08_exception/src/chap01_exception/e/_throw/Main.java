package chap01_exception.e._throw;

import javax.swing.JOptionPane;

/*
 * throw
 * 
 * 1. 자바에서 예외(Exception)를 직접 발생시킬 때 사용 한다.
 * 2. 개발자가 의도적으로 예외 상황을 감지 하거나, 특정 조건에서 예외를 발생 시키고 싶을 때 사용 한다.
 * 3. 기본 문법
 * 	 throw new 예외클래스("예외메시지")
 * 4. throw로 발생한 예외는 try - catch문으로 예외 처리를 하거나, throws를 이용해 예외 위임(전파, 회피)를 해야 한다.
 * 	  (Checked Exception의 경우)
 */
public class Main {

	public static void main(String[] args) {

		try {
			String input = JOptionPane.showInputDialog("점수(0~100) 입력 해");

			int score = Integer.parseInt(input);  // java.lang.NumberFormatException (Unchecked)

			// score의 범위가 0~100인지 확인 후 아닌 경우 예외를 직접 발생 시킨다.
			if(score < 0 || score > 100) {
				throw new RuntimeException(score + " 이건 안됨");  // Unchecked 발생
			}

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
