package chap03_ex;

public class Ex10 {

  public static void main(String[] args) {
    
    /*
     * 별(*)을 반복하여 출력하여 피라미드 모양을 만들어 출력하세요.
     * 
     *        j=12345
     * i=1      * 
     * i=2      ** 
     * i=3      *** 
     * i=4      **** 
     * i=5      *****
     * ---------------
     * i=1, j=1~1 
     * i=2, j=1~2 
     * i=3, j=1~3 
     * i=4, j=1~4 
     * i=5, j=1~5
     * ---------------
     * i=1~5, j=1~i
     */
//	  for(int i = 1; i <= 5; i++) {
//		  for(int j = 1; j <= i; j++) {
//			  System.out.print("*");
//		  }
//		  System.out.println();
//	  }

    
    
    /*
     * 아래의 피라미드 모양도 한 번 고려해 보세요.
     * 
     * (1) 
     *   *****
     *   ****
     *   ***
     *   **
     *   *
     * -------------
     * (2)
     *       *
     *      ***
     *     *****
     *    ******* 
     *   *********
     * -------------
     * (3)
     *   *********
     *    *******
     *     *****
     *      ***
     *       *
     */
	  
//	  for(int i = 1; i <= 5; i++) {
//		  for(int j = 5; j >= i; j--) {
//			  System.out.print("*");
//		  }
//		  System.out.println();
//	  }
	  for(int i = 1; i <= 5; i++) {
		  for(int j = 5; j > i; j--) {
			  System.out.print(' ');
		  } 
		 for(int k = 1; k < i * 2; k++) {
				 System.out.print("*");
		 }
		 System.out.println();
	  }
  }

}
