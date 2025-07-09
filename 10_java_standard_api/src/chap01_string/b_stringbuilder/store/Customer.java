package chap01_string.b_stringbuilder.store;

import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

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
		this.money = money;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public void addToCart(Map<String, Object> product) {
		if(cart == null) {
			JOptionPane.showMessageDialog(null, "cart를 먼저 준비 하세요.");
			return;
		}
		cart.addProduct(product);
	}
		public void removeFromCart(int idx) {
			Map<String, Object> removed = cart.removeProduct(idx);
			if (removed != null) {
				JOptionPane.showMessageDialog(null, removed.get("name") + " 제품이 Cart에서 제거되었습니다.");
			}
	}
	
	public String purchase() {
		if(cart == null) {
			JOptionPane.showMessageDialog(null, "cart가 없어서 구매 할 수 없습니다.");
			return null;
		}
		List<Map<String, Object>> products = cart.getProducts();
		int count = products.size();
		if(count == 0) {
			JOptionPane.showMessageDialog(null, "물건을 담아주세요");
			return null;
		}
//		String receipt = "마마트트 영수증\n";  // 영수증의 첫 문구
		StringBuilder receipt = new StringBuilder("마마트트 영수증\n");
		
		int total = 0;  // 구매 총액
		for(int i = 0; i < count; i++) {   // 구매한 Product 개수 만큼 반복
			Map<String, Object> product = products.get(i); // 구매한 개별 Product
			int price = (int)product.get("price");
			total += price;  // 개별 Product 가격의 구매총액에 누적
			//receipt += String.format("%-30s%8d\n", product.getName(), price);
			// %30s : 문자열을 30자리 고정폭에 작성, - 기호는 왼쪽 정렬을 의미
			// %8d: 정수를 6자리 고정폭으로 작성, - 가 없으면 오른쪽 정렬
			receipt.append((String)product.get("name"));
			receipt.append("-----");
			receipt.append(price + "\n");
//			apthem cpdlsld receipt.append().append().append();
		}
		if(total > money) {  // 구매 불가능
			JOptionPane.showMessageDialog(null, "아이구매 돈이 없네요잉 후딱 들고 오이소");
			return null;
		}
		money -= total;  // 총 상품 금액에서 고객이 소지 하고 있는 금액 차감 ( 구매 )
		receipt.append("구매 총액....." + total +  "\n");
		return receipt.toString();
	}

}
