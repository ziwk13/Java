package practice02_class;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		int n = 10;
		int k = 3;
		int[] answer = new int[n];
		
		for(int i = 0; i <= n - 1; i++) {
				answer[i] += k * i;
			System.out.println(answer[i]);
		}
	}
}
