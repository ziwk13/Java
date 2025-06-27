package chap04_ex_answer;

public class Ex05 {

  public static void main(String[] args) {
    
    // 100000원 이상 모금될때까지 계속해서 money를 모금하는 코드를 구현하세요.
    // 임의의 money 값을 사용하세요.

    // money = 70인 경우의 예시 출력
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ...
    // 1429회 모금액 100030원
    
    int money = 70;  //---------------- 1회 모금액
    int total = 0;  //----------------- 전체 모금액
    final int GOAL = 100000;  //------- 목표
    int nth = 0;  //------------------- 회차
    
    while(total < GOAL) {
      total += money;
      nth++;
      System.out.println(nth + "회 모금액 " + total + "원");
    }

  }

}
