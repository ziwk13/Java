package chap03_compare;

public class CompareEx {

	public static void main(String[] args) {
		
		// Comparison : 비교 연산
		
		int x = 10;
		int y = 20;
		
		System.out.println(x > y);  // greater than (gt)
		System.out.println(x >= y); // greater than or equal to (ge)
		System.out.println(x < y);  // less than (lt)
		System.out.println(x <= y); // less than or equal to (le)
		System.out.println(x == y);  // equal to (eq)
		System.out.println(x != y);  // not equal to (ne)
		
		// 문자열의 비교 : ==, != 를 사용 하지 않는다.
		String s1 = "abc";  // 문자열 저장소에 "abc"를 저장 한다.
		String s2 = "abc";  // 최적화에 의해서 이미 존재하는 "abc"는 새로 만들지 않는다.
		String s3 = new String("abc");  // 객체 생성 코드로 인해서 새로운 "abc"가 저장 된다.
		System.out.println(s1 == s2);  // "abc"가 저장 된 참조 값 비교 (문자열이 저장 된 주소)
		System.out.println(s1 == s3);  // s1의 참조값과 s3의 참조값은 서로 다르므로 false
		System.out.println(s1.equals(s3));  // 문자열의 비교 코드
	}

}
