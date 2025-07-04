package chap06_constructor;

/*
 * 필드에 간접적으로 접근 하는 방법
 * 
 * 1. Getter
 * 	  1) 필드 값을 반환 하는 메소드 이다.
 * 	  2) Getter의 이름은 "get + 필드" 또는 "is + 필드"
 * 2. Setter
 *    1) 인자를 받아서 필드에 저장하는 메소드 이다.
 *    2) Setter의 이름은 "set + 필드" 규칙을 따른다.
 */

public class Brand {

	// 필드
	private String name;  // 브랜드 이름
 	private String nation;  // 브랜드 국적
	
	// 생성자-1
	public Brand() {
		this("KIA", "KOREA");
	}
	// 생성자-2
	public Brand(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	// 메소드
	public void printInfo() {
		System.out.println(name + ", " + nation + ", ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
