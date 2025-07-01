package chap03_ex;

public class Ex01 {

  public static void main(String[] args) {
    
    // 다음 정수형 배열에 저장된 모든 요소의 합계와 평균을 출력하세요.
    
    int[] numbers = {4, 7, 9, 12, 17, 19, 24, 28, 30};
        
    int result = 0;
    for(int i = 0; i < numbers.length; i++) {
    	result += numbers[i];
    }
    System.out.println("합계: " + result);
    System.out.println("평균: " + result / numbers.length);
  }
  
}
