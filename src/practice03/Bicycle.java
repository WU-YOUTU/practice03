package practice03;

public class Bicycle extends Vehicle {
	
	Bicycle(String name, String color) {
		super(name, color);
	}
	
	public void run(int distance) {
		System.out.println("骑行" + distance + "km后");
		this.distance += distance;
		System.out.println("骑行距离为：" + this.distance + "km");
		System.out.println("--------------------");
	}
}
