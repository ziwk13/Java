package chap03_list;

/*
 * Comparable 인터페이스
 * 
 * 1. Functional Interface (추상 메소드가 1개)
 * 2. 정렬이 필요한 객체들은 Comparable 인터페이스의 구현 클래스 객체여야 한다.
 * 3. 추상 메소드
 *    1) int compareTo(T t);
 *    2) 결과가 음수이면 현재 객체를 t 앞에 두고, 양수이면 현재 객체를 t 뒤에 둔다.
 */
public class Data implements Comparable<Data> {

	private int item;
	public Data(int item) {
		this.item = item;
	}
	@Override
	public int compareTo(Data o) {
		return item - o.item;  // 현재 객체의 item이 크면 양수 반환 하므로, 현재 객체를 Data o 뒤에 둔다.
	}
	@Override
	public String toString() {
		return item + "";
	}
}
