package chap02_functional_interface.a_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// 사과 무게를 기준으로 오름차순 정렬 하는 Comparator
		/*
		Comparator<Apple> byWeight = new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return 0;
			}
		};
		*/
		Comparator<Apple> byWeight = (o1, o2) -> (int)(o1.getWeight() - o2.getWeight());
		
		// 사과를 저장 하는 List
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple(100.0));
		apples.add(new Apple(350.0));
		apples.add(new Apple(1250.0));
		apples.add(new Apple(440.0));
		apples.add(new Apple(120.0));
		apples.add(new Apple(220.0));
		
		// List 정렬 하기
		apples.sort(byWeight);
		
		// 확인
		for(Apple apple : apples) {
			System.out.println(apple);
		}
	}
}
