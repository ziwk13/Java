package practice01_class;

public class Main {

	public static void main(String[] args) {
		
		Judge judge = new Judge();
		Player player = new Player();
		
		String user_1 =  player.action();
		judge.action(user_1);

	}

}
