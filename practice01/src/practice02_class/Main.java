package practice02_class;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = sc.nextInt();
		str += "hello";
		
		for(int i = 0; i <= n; i++) {
			System.out.println(str);
		}        

	}

}
