package chap03_method_reference;

import java.util.function.Consumer;
import java.util.function.Function;

/*
 * 메소드 참조(Method Reference)
 * 
 * 1. JDK 8부터 도입된 기능으로 메소드를 람다 표현식 보다 더 간략하게 표현 할 수 있는 문법
 * 2. 람다 표현식이 특정 메소드 하나를 단순히 호출하는 경우, 불필요한 매개변수나 화살표(->) 등을 생략 하고,
 *    :: 기호를 이용해 메소드를 참조 할 수 있다.
 * 3. 종류
 *    1) 정적 메소드 참조       t -> Class.method(t)      Class::method
 *    2) 인스턴스 메소드 참조   t -> obj.method(t)        obj::method
 *    3) 매개변수 메소드 참조  (obj, t) -> obj.method(t)  Class::method
 *    4) 생성자 참조    		t -> new Class(t)		  Class::new
 */

public class Main {

	public static void main(String[] args) {
		
		// 정적 메소드 참조
		Function<String, Integer> f = Integer::parseInt;
		System.out.println(f.apply("222") + 1);
		
		// 인스턴스 메소드 참조
		Consumer<String> c = System.out::println;  // t -> System.in.println(t)
		c.accept("null");
		
		// 매개변수 메소드 참조
		Function<String, Integer> len = String::length;  // t -> t.length()
		System.out.println(len.apply("Apple"));
		
		//  생성자 참조
		Function<String, StringBuilder> builder = StringBuilder::new;  // t -> new StringBuilder(t)
		 String result = builder.apply("졸려죽긋다").append("진짜로").toString();
		System.out.println(result);

	}

}
