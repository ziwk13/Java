package chap01_branch;

public class IfEx {

	public static void main(String[] args) {

		// 짝수/홀수
		int x = 10;
		if(x % 2 == 0) {
			System.out.println(x + "는 짝수 입니다.");
		} else {
			System.out.println(x + "는 홀수 입니다.");
		}

		// 3의 배수
		int y = 10;
		if(y % 3 == 0) {
			System.out.println(y + "은 3의 배수 입니다.");
		} else {
			System.out.println(y + "은 3의 배수가 아닙니다.");
		}

		// 학점(A, B, C, D, F)
		int score = 90;
		char grade;
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(score + "점은 " + grade + "학점 입니다.");
	}
}
