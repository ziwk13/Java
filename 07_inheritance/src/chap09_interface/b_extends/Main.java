package chap09_interface.b_extends;

public class Main {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Computable com = new Computer();
		
		System.out.println("전압: " + ElectronicProduct.VOLT);
		com.powerOn();
		com.powerOff();
		
		int a = 10 , b = 4;
		System.out.println(com.add(a, b));
		System.out.println(com.sub(a, b));
		System.out.println(com.mul(a, b));
		System.out.println(com.div(a, b));
		System.out.println(com.mod(a, b));
	}

}
