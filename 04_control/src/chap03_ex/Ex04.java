package chap03_ex;

public class Ex04 {

	public static void main(String[] args) {

		// 점수와 학년에 따른 합격 여부를 출력하세요.
		// 대학 1~2학년은 60점 이상이면 "합격"이고, 3~4학년은 70점 이상이어야 "합격"입니다.

		int score = 80;
		int grade = 3;
		
		if((grade >= 1 && grade <= 2 && score >= 60) 
		|| (grade >= 3 && grade <= 4 && score >= 70)) {
			System.out.println("합격");
		} else
			System.out.println("불합격");
	}
}
