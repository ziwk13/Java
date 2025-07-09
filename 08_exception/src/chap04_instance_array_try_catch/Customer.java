package chap04_instance_array_try_catch;

public class Customer {

	// 필드
	private int money;
	private Cart cart;

	// 생성자
	public Customer(int money) {
		this.money = money;
	}

	// 메소드
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		// 마이너스 money는 예외 발생 후 예외 처리
		try {
			if(money < 0 ) {
				throw new RuntimeException("0원은 입력 할 수 없습니다");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.money = money;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public void addToCart(Product product) {
		try {
			if(cart == null) {
				throw new RuntimeException("cart를 먼저 준비 하세요.");
			}
			cart.addProduct(product);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String purchase() {
		String receipt = null; // 영수증의 첫 문구
		try {
			if(cart == null) {
				throw new RuntimeException("cart가 없어서 구매 할 수 없습니다.");
			}
			if(cart.getCount() == 0) {
				throw new RuntimeException("물건을 담아주세요");
			}
			receipt = "구구디디마트 영수증\n";
			int total = 0;  // 구매 총액
			Product[] products = cart.getProducts();  // Cart에 저장된 Product[] 배열
			for(int i = 0, count = cart.getCount(); i < count; i++) {   // 구매한 Product 개수 만큼 반복
				Product product = products[i]; // 구매한 개별 Product
				int price = product.getPrice();
				total += price;  // 개별 Product 가격의 구매총액에 누적
				receipt += product.getName();  // 구매 내역을 영수증에 기록			
				receipt += "----";  // 구매 내역을 영수증에 기록
				receipt += price + "\n";  // 구매 내역을 영수증에 기록
			}
			if(total > money) {  // 구매 불가능
				receipt = null;
				throw new RuntimeException("아이구매 돈이 없네요잉 후딱 들고 오이소");
			}
			money -= total;  // 총 상품 금액에서 고객이 소지 하고 있는 금액 차감 ( 구매 )
			receipt += "구매 총액....." + total +  "\n";  // 영수증 마지막 문구
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return receipt;
	}
}
