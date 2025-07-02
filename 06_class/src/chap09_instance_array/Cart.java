package chap09_instance_array;

import javax.swing.JOptionPane;

public class Cart {
	
	// 필드
	private Product[] products;  // Product[] 배열 선언 (배열의 생성이 팔요 하다.)
	private int count;  // products 배열에 저장된 Product 개수
	private final int LIMIT = 100;  // products 배열의 최대 길이 (final 상수: 값을 바꿀 수 없다. 반드시 초기화가 필요함)
	// 생성자
	public Cart() {
		// new Cart() 실행 시 products 배열이 생성 된다.
		products = new Product[LIMIT];
	}
	// 메소드
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void addProduct(Product product) {
		if(product == null) {
			JOptionPane.showMessageDialog(null, "전달된 Product이 없습니다.");
			return;
		}
		if(count == LIMIT) {
			JOptionPane.showMessageDialog(null, "더 이상 Cart에 담을 수 없습니다.");
			return;
		}
		products[count++] = product;
	}
	
	
	 

}
