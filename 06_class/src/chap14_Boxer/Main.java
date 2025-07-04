package chap14_Boxer;

public class Main {

	public static void main(String[] args) {

		Boxer boxer1 = new Boxer("마이크 타이슨 ", 1000, 50);
		Boxer boxer2 = new Boxer("무하마드 알리 ", 1000, 40);

		// boxer2가 boxer1을 먼저 때립니다. 이후 번갈아가면서 한 번씩 때립니다. 누구든 먼저 energy가 0이 되면 멈춥니다.
		while(true) {
			boxer2.punch(boxer1);
			if(boxer1.getEnergy() <= 0) {
				System.out.println(" 승자 " + boxer2.getName() + " 남은 에너지 " + boxer2.getEnergy());
				break;
			}
			boxer1.punch(boxer2);
			if(boxer2.getEnergy() <= 0) {
				System.out.println(" 승자 " + boxer1.getName() + " 남은 에너지 " + boxer1.getEnergy());
				break;
			}
		}

		// 누가 KO승을 했는지 확인할 수 있도록 name과 남은 energy를 출력합니다.
		if(boxer1.getEnergy() > 0) {
			System.out.println(boxer1.getName() + "(" + boxer1.getEnergy() + ")");
		}
		System.out.println(boxer2.getName() + "(" + boxer2.getEnergy() + ")");
	}

}
