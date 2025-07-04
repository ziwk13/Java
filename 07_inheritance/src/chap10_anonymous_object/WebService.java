package chap10_anonymous_object;

public class WebService {
	
	public static void signUp(Button cfb) {
		System.out.println("가입! 회원!");
		cfb.onClick();
	}
	
	public static void createPost(Button ctb) {
		System.out.println("작성! 게시글!");
		ctb.onClick();
	}
}
