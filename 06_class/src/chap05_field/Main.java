package chap05_field;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.model + ", " + car.price);

		// 객체마다 서로 다른 필드값을 가질 수 있다.
		Car car1 = new Car();
		Car car2 = new Car();
		//car1.model = "Sorento"; car1.price = 5000;
		//car2.model = "Santafe"; car2.price = 4500;
		car1.setInfo("Sorento", 5000);
		car2.setInfo("Santafe", 4500);
		System.out.println(car1.model + ", " + car1.price);
		System.out.println(car2.model + ", " + car2.price);
		car1.printInfo();
		car2.printInfo();
	}

}
