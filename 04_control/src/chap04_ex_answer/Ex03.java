package chap04_ex_answer;

public class Ex03 {

  public static void main(String[] args) {
    
    // 정수형 변수 num1, num2, 그리고 문자형 변수 op('+', '-', '*', '/', '%')를 선언하고, switch문을 사용하여 해당 연산 결과를 출력하세요.

    int num1 = 4;
    int num2 = 7;
    
    char op = '+';  // '+', '-', '*', '/', '%'
    
    switch(op) {
    case '+' : System.out.println(num1 + num2); break;
    case '-' : System.out.println(num1 - num2); break;
    case '*' : System.out.println(num1 * num2); break;
    case '/' : System.out.println(num1 / num2); break;
    case '%' : System.out.println(num1 % num2); break;
    }
    
  }

}
