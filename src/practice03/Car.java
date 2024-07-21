package practice03;

public class Car extends Vehicle {
	
	public int litre = 100;
	
	Car(String name, String color) {
		super(name, color);
	}
	
	public void printData() {
		super.printData();
		System.out.println("油箱油量：" + this.litre + "L");
	}
	
	public void run(int distance) {
		System.out.println("驾驶" + distance + "km后");
		if (distance <= this.litre) {
			this.distance += distance;
			this.litre -= distance;
		} else {
			System.out.println("油箱油量不足！");
		}
		System.out.println("行驶距离为：" + this.distance + "km");
		System.out.println("油箱剩余油量为：" + this.litre + "L");
		System.out.println("--------------------");
	}
	
	public void charge(int litre) {
		System.out.println("加" + litre + "L油后");
		if (litre <= 0) {
			System.out.println("油箱油量不变！");
		} else if (litre + this.litre >= 100) {
			System.out.println("油箱已满！");
			this.litre = 100;
		} else {
			this.litre += litre;
		}
		System.out.println("现油箱油量为：" + this.litre + "L");
		System.out.println("********************");
		System.out.println("********************");
		System.out.println("********************");
	}
}
