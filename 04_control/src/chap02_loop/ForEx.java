package chap02_loop;

public class ForEx {

	public static void main(String[] args) {


		// 1 ~ 100 누적하기
		int total = 0;
		for (int x = 1; x <= 100; x++) {
			total += x;
		}
		System.out.println(total);

		// 1 ~ 100 홀수의 평균(합계 / 개수)
		int oddTotal = 0;
		int oddCount = 0;
		double oddAverage;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				oddTotal += i;
				oddCount++;
			}
		}
		oddAverage = (double)oddTotal / oddCount; // oddTotal을 double로 casting 하면, oddCount는 double로 promotion 된다.
		System.out.println("홀수의 평균: " + oddAverage);
		System.out.println("홀수의 합계: " + oddTotal);
		System.out.println("홀수의 개수: " + oddCount);

		for(int i = 0; i < 5; i++) {
			for(int y = 0; y <= i; y++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}

	}

}
