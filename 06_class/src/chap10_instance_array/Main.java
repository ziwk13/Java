package chap10_instance_array;

public class Main {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		
		bus.on(new Person("시시"));
		bus.on(new Person("둘둘"));
		bus.on(new Person("셋셋"));
		bus.on(new Person("넷ㄴ세"));
		bus.on(new Person("오오"));
		
		bus.off(4);
		
		bus.on(new Person("열열"));
		
		bus.seatInfo();

	}

}
