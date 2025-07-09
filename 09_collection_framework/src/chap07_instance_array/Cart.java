package chap07_instance_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Cart {
	
	// 필드
	private List<Map<String, Object>> products;  
	private int count;
	// 생성자
	public Cart() {
		// new Cart() 실행 시 products 배열이 생성 된다.
		products = new ArrayList<Map<String,Object>>();
	}
	// 메소드
	
	public List<Map<String, Object>> getProducts() {
		return products;
	}


	public void setProducts(List<Map<String, Object>> products) {
		this.products = products;
	}


	public void addProduct(Map<String, Object> product) {
		if(product == null) {
			JOptionPane.showMessageDialog(null, "전달된 Product이 없습니다.");
			return;
		}
		products.add(product);
	}
	public Map<String, Object> removeProduct(int idx) {
		int count = products.size();
		if(count == 0 ) {
			JOptionPane.showMessageDialog(null, "카트가 비어있습니다");
		}
		if(idx < 0 || idx >= count) {
			JOptionPane.showMessageDialog(null, "는 없는 인덱스 입니다.");
		}
		return products.remove(idx);
	}
}
