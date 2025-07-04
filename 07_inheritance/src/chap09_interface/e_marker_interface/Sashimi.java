package chap09_interface.e_marker_interface;

public class Sashimi implements Food, FavoriteFood {
	@Override
	public void howToEat() {
		System.out.println("사시미는 맥주와 같이 먹으면 마시씀");

	}

}
