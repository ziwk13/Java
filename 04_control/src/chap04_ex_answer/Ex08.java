package chap04_ex_answer;

public class Ex08 {

  public static void main(String[] args) {

    // 전체 구구단을 세로 방향으로 출력하세요.

    // 출력 예시
    // 2x1=2
    // 2x2=4
    // ...
    // 9x9=81
    
    for(int dan = 2; dan <= 9; dan++) {
      for(int n = 1; n <= 9; n++) {
        System.out.println(dan + "x" + n + "=" + (dan * n));
      }
    }

  }

}
