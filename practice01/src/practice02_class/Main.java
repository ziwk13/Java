package practice02_class;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int answer = 0;
		int result = 0;
		int[] num_list = {2,3,4,5};
		for(int i = 0; i <= num_list.length - 1; i++) {
			result += num_list[i];
			if(num_list.length >= 11) {
				 answer = result;
			}  else if(result <= 10) {
				 answer *= num_list[i];   
			}
		}
		System.out.println(answer);
	}
}
