package chap05_instance_array_throws;

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
		try {
			// Product 제품 진열 하기
			Product p1 = new Product("양파1.5kg", 3000);
			Product p2 = new Product("고양이 사료", 25000);
			Product p3 = new Product("제육볶음", 10000);
			Product p4 = new Product("발렌타인30년", 290000);
			Product p5 = new Product("모둠회", 30000);

			// 카트 세팅
			Cart c1 = new Cart();
			Cart c2 = new Cart();

			// 손놈 등장
			Customer cu1 = new Customer(50000);
			Customer cu2 = new Customer(468900);
			Customer cu3 = new Customer(10000000);

			// 손님이 카트 획득
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
				System.out.println(receipt1);  // 구매 Product 목록 + 총 구매 금액
				System.out.println(receipt2);  // 구매 Product 목록 + 총 구매 금액
				System.out.println("남은 돈:" + cu3.getMoney());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
