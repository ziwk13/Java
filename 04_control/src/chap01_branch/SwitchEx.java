package chap01_branch;

public class SwitchEx {

	public static void main(String[] args) {

		// 짝수 / 홀수 가능한 표현식 타입 : byte, short, int, char, String (불가능 : long, float, double, boolean)
		int x = 10;
		switch(x % 2) {
		case 0: System.out.println("짝수"); break;
		case 1: System.out.println("홀수");
		}

		// 3의 배수
		int y = 9;
		switch(y % 3) {
		case 0: System.out.println("3의 배수 맞음 ㅇㅇ"); break;
		default: System.out.println("3의 배수 아님");
		}

		// 학점(A, B, C, D, F)
		int score = 30;
		char grade;
		switch(score / 10) {
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		System.out.println(score + "점은 " + grade + "학점 입니다.");

		// Level에 따른 권한 처리 (break문이 없는 switch문)
		int level = 3;
		String auth = "";
		switch (level) {
		case 3: auth += "A";
		case 2: auth += "B";
		case 1: auth += "C";
		}
		System.out.println(level + " : " + auth);
	}

}
