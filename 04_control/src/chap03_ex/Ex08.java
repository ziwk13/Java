package chap03_ex;

public class Ex08 {

  public static void main(String[] args) {

    // 전체 구구단을 세로 방향으로 출력하세요.

    // 출력 예시
    // 2x1=2
    // 2x2=4
    // ...
    // 9x9=81
	  
	  int result = 0;
	  
	  for(int i = 2; i <= 9; i++) {
		  System.out.println("===" + i + "단===");
		  for(int j = 1; j <= 9; j++) {
			  System.out.println(i + "x" + j + "=" + (i * j));
		  }
		  System.out.println();
	  }
  }
}
