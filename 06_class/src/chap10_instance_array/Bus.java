package chap10_instance_array;

public class Bus {

	private Seat[] seats;
	private int count;
	private final int LIMIT = 5;
	
	public Bus() {
		// Seat가 들어갈 자리를 만들어준다.
		seats = new Seat[LIMIT];
		// Seat가 들어갈 각 자리에 실제 Seat를 만들어 넣는다.
		for(int i = 0; i < LIMIT; i++) {
			seats[i] = new Seat();
		}
	}
	
	public void seatInfo() {
		for(int i = 0; i < LIMIT; i++) {
			// 각 Seat에 앉아 있는 Person
			Person person = seats[i].getPerson();
			if(person == null) {
				System.out.println(String.format("%02d", i + 1) + "번 좌석: 비어있음");
			} else {
				System.out.println(String.format("%02d", i + 1) + "번 좌석: " + person.getName());
			}
		}
	}
	// Bus 탑승 (빈 Seat가 보이면 순차적으로 채운다.)
	public void on(Person person) {
		if(count == LIMIT) {
			System.out.println("아따 자리가 없어브러야");
			return;
		}
		for(int i = 0; i < LIMIT; i++) {
			if(seats[i].getPerson() == null) {
				seats[i].setPerson(person);
				count++;
				break;
			}
		}
	}
	// Bus 하차 (Seat 번호(인덱스보다 1 큰 수)를 전달해서 해당 Seat를 비운다.)
	public void off(int seatNo) {
		if(seatNo <= 0 || seatNo > LIMIT) {
			System.out.println("아따 그자리는 없는 번호인디");
			return;
		}
		// seats[seatNo - 1] = null; Seat 자체가 없어지는 코드
		System.out.println("야는 내려버렸어");
		seats[seatNo - 1].setPerson(null);
		count--;
	}
}
