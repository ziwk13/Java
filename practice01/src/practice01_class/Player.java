package practice01_class;

import java.util.Scanner;

public class Player extends Person {

	
	public String action() {
		Scanner sc = new Scanner(System.in);
		String result = sc.next();
		return result;
	}
}
