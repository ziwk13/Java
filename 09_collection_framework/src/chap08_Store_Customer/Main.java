package chap08_Store_Customer;

public class Main {

  public static void main(String[] args) {
    
    //----- 한 명의 고객을 생성합니다.
	  Customer man1 = new Customer(0, 1000000);
    
    //----- 상품을 판매할 두 개의 상점을 생성합니다.
	  Store appleStore = new Store(5, 50000, 1000000);
	  Store samsung = new Store(3, 20000, 1000000);
    
    //----- 첫 번째 상점에서 상품을 구매합니다.
	  man1.purchase(appleStore, 2, 600000);
    
    //----- 두 번째 상점에서 상품을 구매합니다.
    man1.purchase(samsung, 3, 300000);
    //----- 모든 상점의 정보와 고객의 정보를 출력합니다.
    System.out.println("[애플]");
    System.out.println(appleStore.getCount() + "개 남았고, " + appleStore.getMoney() + "원 남음!");
    System.out.println("[삼성]");
    System.out.println(samsung.getCount() + "개 남았고, " + samsung.getMoney() + "원 남음!");
    System.out.println("[나]");
    System.out.println(man1.getCount() + "개 있고, " + man1.getMoney() + "썼음!");
	  
  }

}
