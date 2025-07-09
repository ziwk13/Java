package chap04_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Set<T> 인터페이스
 * 
 * 1. JCF에서 중복을 허용하지 않는 데이터 집합을 정의 하는 인터페이스.
 * 2. 수학의 집합과 유사하게, 동일한 요소를 2번 이상 저장 할 수 없고, 요소들의 저장 순서도 없다. (인덱스가 없다)
 * 3. 주요 구현 클래스
 *    1) HashSet       : 해시 테이블 기반, 순서 보장 없음, 성능이 우수
 *    2) TreeSet	   : 이진 탐색 트리 기반, 순서 보장 가능, 정렬 상태 유지
 *    3) LinkedHashSet : 해시 테이블 + 연결 리스트 기반, 순서 보장 가능, 저장 한 순서를 유지 (예: 최근 방문한 URL 기록 등)
 */
/*
 * 해시 (Hash)
 * 
 * 1. 해시는 임의의 데이터를 고정된 크기의 값(해시값)으로 변환 하는 방법 또는 그 결과 값 자체를 의미 한다.
 * 2. 해시 함수를 통해서 입력 값에 따라 서로 다른 결과값(해시값)이 나오도록 설계되어 있다.
 * 3. 데이터 검색, 무결성 검사, 암호화 등 다양한 분야에서 활용 한다.
 * 
 * 해시 테이블 (Hash Table)
 * 
 * 1. 해시 함수를 이용해 데이터를 저장 하고 검색 하는 자료 구조(Data Structure)
 * 2. 데이터를 키(Key)-값(Value) 형태로 저장 하며, 키(Key)를 해시 함수에 넣어 얻는 해시값을 배열의 인덱스로 사용 해 값을 저장 한다.
 * 3. 빠른 검색, 삽입, 수정이 가능 하다.
 * 
 * 예시) 뽀로로, 루피, 에디, 포, 크롱 데이터 저장 하기
 * - key   : 이름을 사용
 * - Value : 각 캐릭터의 자세한 설명을 객체로 저장
 * 
 * - 해시 함수 (Key를 이용해서 어떤 값을 반환하는 함수)+
 *   : 이름의 획수를 해시값으로 사용 하자.
 *   
 * - 뽀로로의 해시값은 34 -> 인덱스 34에 뽀로로 객체를 저장
 * - 루피의 해시값은 12   -> 인덱스 12에 루피 객체를 저장
 * - 에디의 해시값은 8    -> 인덱스 8에 에디 객체를 저장
 * - 포의 해시값은 6      -> 인덱스 6에 포 객체를 저장
 * - 크롱의 해시값은 12   -> 인덱스 12에 크롱 객체를 저장 (해시값 충돌 : 체이닝 방식(연결 리스트)등으로 기존 루피 객체에 이어서 크롱 객체를 저장)
 */
public class Main {
	public static void hashSet() {
		Set<String> hobbies = new HashSet<String>();
		hobbies.add("여행");
		hobbies.add("클라이밍");
		hobbies.add("게임");  
		hobbies.add("코딩");
		hobbies.add("게임");  // 중복 저장 허용은 불가능
		
//		System.out.println(hobbies);  // 요소들의 저장 순서는 보장되지 않는다.
		
		// List 인터페이스와 동일하게 Collection 인터페이스를 구현했으나 인덱스 관련 사용은 불가능 하다.
		// hobbies.get(0);, hibbies.remove(0), 일반 for문 등
		
		// 향상 for문
		for(String hobby : hobbies) {
//			System.out.println(hobby);
		}
	}
	public static void unique() {
		Set<Person> people = new HashSet<Person>();
		people.add(new Person("김호령", 34));
		people.add(new Person("김호령", 34));
		people.add(new Person("김호령", 34));
		
//		System.out.println(people);
	}
	public static void treeSet() {
		
		// TreeSet : 정렬이 유지되는 Set
		// Set 인터페이스의 하위 인터페이스 SortedSet 인터페이스를 타입으로 사용
		SortedSet<String> hobbies = new TreeSet<>();  // 기본 생성 방식은 오름차순 정렬을 지원
		hobbies.add("여행");
		hobbies.add("클라이밍");
		hobbies.add("게임");  
		hobbies.add("코딩");
		hobbies.add("볼링");  
		hobbies.add("골프");
		
		System.out.println(hobbies);
		String first = hobbies.first();  // 가장 작은 요소
		String last  = hobbies.last();  // 가장 큰 요소
		System.out.println(first + " , " + last);
		
		String from = "골프";
		String to = "코딩";
		System.out.println(hobbies.subSet(from, to));  // from 포함, to 불포함
		
		hobbies = new TreeSet<String>(Comparator.reverseOrder()); // 내림차순 정렬 되는 hobbies
		hobbies.add("여행");
		hobbies.add("클라이밍");
		hobbies.add("게임");  
		hobbies.add("코딩");
		hobbies.add("볼링");  
		hobbies.add("골프");
		System.out.println(hobbies);
	}
	public static void linkedHashSet() {
		
		// LinkedHashSet : 순서를 유지하는 Set
		Set<String> hobbies = new LinkedHashSet<String>();
		hobbies.add("여행");
		hobbies.add("클라이밍");
		hobbies.add("게임");  
		hobbies.add("코딩");
		hobbies.add("볼링");  
		hobbies.add("골프");
		
		System.out.println(hobbies);
		
	}

	public static void main(String[] args) {
		
		String a = "뽀로로";
		String b = "루피";
		String c = new String("크롱");
		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(c.hashCode());
		
//		hashSet();
//		unique();
//		treeSet();
		linkedHashSet();
	}
}
