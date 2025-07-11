package practice01_class;

public class Judge extends Person {

	
	public String action(String user_1) {
		
		String score = (int)(Math.random() * 4000 + 1) + "";		
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < user_1.length(); i++) {
			if(user_1.charAt(i) == score.charAt(i)) {
				strike++;
			}
			else if(user_1.substring(i, user_1.length()).contains(score.charAt(i) + "")) {
				ball++;
			}
		} return "";
	}
}
