package practice03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Vehicle vehicle1 = new Car("法拉利", "红色");
		Vehicle vehicle2 = new Bicycle("捷安特", "蓝色");
		
		Person person1 = new Person("Tom", "G.", "Hanks", 50, "演员");
		Person person2 = new Person("Tom", "Hook", 28, "公务员");
		
		person1.buy(vehicle1);
		person2.buy(vehicle2);
		
		System.out.println("汽车信息如下：");
		vehicle1.printData();
		System.out.println("====================");
		System.out.println("车主信息如下：");
		vehicle1.getOwner().printData();
		System.out.print("请输入驾驶距离（km）：");
		int distanceOfVehicle1 = scanner.nextInt();
		vehicle1.run(distanceOfVehicle1);
		System.out.print("请输入加油量（L）：");
		int litre = scanner.nextInt();
		((Car)vehicle1).charge(litre);
		
		System.out.println("自行车信息如下");
		vehicle2.printData();
		System.out.println("====================");
		System.out.println("车主信息如下：");
		vehicle2.getOwner().printData();
		System.out.print("请输入骑行距离（km）：");
		int distanceOfVehicle2 = scanner.nextInt();
		vehicle2.run(distanceOfVehicle2);
		
		scanner.close();
	}
}
