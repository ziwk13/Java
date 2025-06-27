package chap04_ex_answer;

public class Ex07 {

  public static void main(String[] args) {
    
    // 정수형 변수 n을 이용하여 n!(팩토리얼) 값을 구하세요.
    // n은 1 ~ 20 사이의 값을 가져야 합니다.

    int n = 20;
    
    long factorial = 1;
    
    for (int i = 1; i < n + 1; i++) {
      factorial *= i;
    }
    
    System.out.println(n + "! = " + factorial);
    
  }

}
