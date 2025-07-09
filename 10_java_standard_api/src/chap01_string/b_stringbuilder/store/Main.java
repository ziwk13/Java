package chap01_string.b_stringbuilder.store;

import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		

		// "1" -> 1
		int x = Integer.parseInt("1");
//		System.out.println(x + 1);
		// "1.5" -> 1.5
		double y = Double.parseDouble("1.5");
//		System.out.println(y + 1);
		
		// 입력 대화상자
//		String name = JOptionPane.showInputDialog("이름을 입력");
//		System.out.println(name);
		// 나이 입력 받기
		// showInputDiaglog()는 항상 String을 반환 하므로 적절한 변환 과정이 필요 할 수 있다.
//		int age = Integer.parseInt(JOptionPane.showInputDialog("숫자를 달라"));
//		System.out.println(age);

//----------------------------------------------------------------------------------------------------//		
		// Product 제품 진열 하기
		Map<String, Object> p1 = Map.of("name", "양파1.5kg", "price", 3000);
		Map<String, Object> p2 = Map.of("name", "고양이 사료", "price", 25000);
		Map<String, Object> p3 = Map.of("name", "제육볶음", "price", 10000);
		Map<String, Object> p4 = Map.of("name", "발렌타인30년", "price", 290000);
		Map<String, Object> p5 = Map.of("name", "모둠회", "price", 30000);
		
		// 카트 세팅
		Cart c1 = new Cart();
		Cart c2 = new Cart();
		
		// 손놈 등장
		Customer cu1 = new Customer(50000);
		Customer cu2 = new Customer(468900);
		Customer cu3 = new Customer(10000000);
		
		// 손놈이 카트 획득
		cu1.setCart(c1);
		cu3.setCart(c2);
		
		// 파밍
		cu1.addToCart(p2);
		cu1.addToCart(p3);
		cu1.addToCart(p5);
		cu3.addToCart(p4);
		cu3.addToCart(p5);
		
		// 구매
		String receipt1 = cu1.purchase();
		String receipt2 = cu3.purchase();
		
		
		// 구매내역 확인
		if(receipt2 != null) {
//		System.out.println(receipt);  // 구매 Product 목록 + 총 구매 금액
			System.out.println(receipt2);  // 구매 Product 목록 + 총 구매 금액
			System.out.println("남은 돈:" + cu3.getMoney());
			
		}
	}

}
