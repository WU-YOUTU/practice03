package practice03;

public class Person {
	
	private String firstName, middleName, lastName, job;
	private int age;
	
	Person(String firstName, String lastName, int age, String job) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job =job;
	}
	
	Person(String firstName, String middleName, String lastName, int age, String job) {
		this(firstName, lastName, age, job);
		this.middleName = middleName;
	}
	
	public void printData() {
		System.out.println("--------------------");
		System.out.println("姓名：" + this.fullName());
		System.out.println("年龄：" + this.age);
		System.out.println("职业：" + this.job);
		System.out.println("--------------------");
	}
	
	public String fullName() {
		if (this.middleName == null) {
			return this.firstName + " " + this.lastName;
		} else {
			return this.firstName + " " + this.middleName + " " + this.lastName;
		}
	}
	
	public void buy(Vehicle vehicle) {
		vehicle.setOwner(this);
	}
}
