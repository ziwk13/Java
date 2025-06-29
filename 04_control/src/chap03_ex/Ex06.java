package chap03_ex;

public class Ex06 {

  public static void main(String[] args) {
    
    // 100부터 1까지 역순으로 값을 출력하세요.
    // 한 줄에 숫자를 10개씩 출력하세요.
    
	  int number = 100;
	
	  for(int i = 0; i < 10; i++) {
		  for(int j = 0; j < 10; j++) {
			  System.out.print(number-- + " ");
		  }
		  System.out.println();
	  }
  }
}
