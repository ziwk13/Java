package chap06_constructor;

public class Main {

	public static void main(String[] args) {
		
		// 디폴트 생성자 호출
		Car car1 = new Car();
		System.out.println(car1);
		
		// 일반 생성자2 호출
		Car car2 = new Car("Sorento");
		System.out.println(car2.model);
		
		// 일반 생성자3 호출
		Car car3 = new Car(4500);
		System.out.println(car3.price);
		
		Car car4 = new Car("Sorento", 5000);
		car4.printInfo();
		
		Car car5 = new Car("G90", 9000, new Brand("GENESIS", "KOREA"));
		car5.printInfo();
		
		

	}

}
