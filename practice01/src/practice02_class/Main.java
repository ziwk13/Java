package practice02_class;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int[] result = {};
		List<Integer> list = new ArrayList<>();
		int n = 10;
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				list.add(i);
			}
		}
		System.out.println(list);
		
	}
}
