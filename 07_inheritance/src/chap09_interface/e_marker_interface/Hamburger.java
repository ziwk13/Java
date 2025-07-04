package chap09_interface.e_marker_interface;

public class Hamburger implements Food, FavoriteFood {
	@Override
	public void howToEat() {
		System.out.println("크기가 큰 햄버거 먹기 힘듬");
	}
}
