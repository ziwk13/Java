package chap09_interface.d_extebds_implements;

// 클래스를 먼저 상속하고, 인터페이스를 나중에 구현 한다.

public class JejuTour extends Domestic implements Trip {

	@Override
	public void sightseeing() {
		System.out.println("성산일출봉");
		
	}

	@Override
	public void foodTrip() {
		System.out.println("고기국수");
	}

}
