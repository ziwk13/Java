package chap04_stream;

public class Fruit {

	private String name;
	private double weight;
	public Fruit(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", weight=" + weight + "]";
	}
}	
