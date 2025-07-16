package chap02_functional_interface.e_predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/*
 * java.util.function.Predicate<T>
 * 
 * 1. 매개변수가 있고 boolean 타입의 값을 반환 하는 메소드를 가진 인터페이스
 * 2. 추상 메소드
 * 	  boolean test(T t);
 * 3. 주요 인터페이스
 *    1) Predicate<T>     boolean test<T>;
 *    2) IntPredicate     boolean test<int>;
 *    3) DoublePredicate  boolean test<double>;
 */

public class Main {

	public static void main(String[] args) {

		Predicate<Integer> p1 = t -> t  > 0;
		System.out.println(p1.test(10) ? "양슈" : "음슈");
		System.out.println(p1.test(-10) ? "양슈" : "음슈");
		
		IntPredicate p2 = t -> t % 2 == 0;
		System.out.println(p2.test(2) ? "짝수" : "홀수");
		System.out.println(p2.test(3) ? "짝수" : "홀수");
		
		Predicate<String> over4 = s -> s.length() > 10;
		applyPredicate("Predicate", over4);  // 문자열이 4글자 이상인지 검증
		applyPredicate("applyPredicate", over4);
		
		Predicate<Integer> pass = n -> n >= 60; // 정수 값이 60 이상인지 검증
		applyPredicate(48, pass);
		applyPredicate(70, pass);
	}
	
	public static <T> void applyPredicate(T t, Predicate<T> p) {
		if(p.test(t)) {
			System.out.println(t + "은(는) 조건에 부합");
		} else {
			System.out.println(t + "은(는) 조건에 부합 x");
		}
	}
}
