package chap04_ex_answer;

public class Ex07 {

  public static void main(String[] args) {
    
    // 10진수(number)를 2진수로 변환한 결과를 배열 binary에 저장하세요.

    // 10진수
    int number = 35;
                        // 2 | 35
                        //   └----
                        // 2 | 17  ... 1 → binary[0]
                        //   └----
                        // 2 |  8  ... 1 → binary[1]
                        //   └----
                        // 2 |  4  ... 0 → binary[2]
                        //   └----
                        // 2 |  2  ... 0 → binary[3]
                        //   └----
                        // 2 |  1  ... 0 → binary[4]
                        //   └----
                        //      0  ... 1 → binary[5]
    
    // 2진수
    int[] binary = new int[10];
                        //  ┌---+---+---+---+---+---+---+---+---+---┐
                        //  | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
                        //  └---+---+---+---+---+---+---+---+---+---┘
                        //    0   1   2   3   4   5   6   7   8   9
    int i = 0;
    while (number > 0) {
      binary[i++] = number % 2;
      number /= 2;
    }
    
    for(int j = i - 1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
    
  }
  
}
