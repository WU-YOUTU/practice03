package practice03;

public abstract class Vehicle {
	
	protected String name, color;
	protected int distance = 0;
	private Person owner;
	
	Vehicle(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void setOwner(Person person) {
		this.owner = person;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public void printData() {
		System.out.println("--------------------");
		System.out.println("品牌名：" + this.name);
		System.out.println("颜色：" + this.color);
		System.out.println("里程数：" + this.distance + "km");
	}
	
	public abstract void run(int distance);
}
