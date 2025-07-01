package chap09_instance_array;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// "1" -> 1
		int x = Integer.parseInt("1");
		System.out.println(x + 1);
		// "1.5" -> 1.5
		double y = Double.parseDouble("1.5");
		System.out.println(y + 1);
		
		// 입력 대화상자
		String name = JOptionPane.showInputDialog("이름을 입력");
		System.out.println(name);
		// 나이 입력 받기
		// showInputDiaglog()는 항상 String을 반환 하므로 적절한 변환 과정이 필요 할 수 있다.
		int age = Integer.parseInt(JOptionPane.showInputDialog("숫자를 달라"));
		System.out.println(age);

	}

}
