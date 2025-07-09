package practice01_class;

public class Main {

	public static void main(String[] args) {

		int[] answer = new int[2];
		
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;
		
		int mother = denom1 * denom2;
		int children1 = numer1 * denom2;
		int children2 = numer2 * denom1;
		int children = children1 + children2;
		int result = 0;
		
		if(mother % 2 == 0 && children % 2 == 0) {
			answer[1] = mother / 2;
			answer[0] = children / 2;
		}
		System.out.println(answer[1]);
		System.out.println(answer[0]);
		
	}
}
