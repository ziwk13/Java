package chap03_ex;

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
	  
	  int money = 90;
	  int total = 0;
	  
	  for(int i = 1; total <= 100000; i++) {
		  total += money;
		  System.out.println(i + "회 모금액" + total + "원");
	  }
    
    

  }

}
