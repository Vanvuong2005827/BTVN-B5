package core;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;
	protected Address address;
	
	//constructor's
	public Person() {
		
	}
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//getter's
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
	
	//setter's
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//I/O
	public void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		this.name = sc.nextLine();
		
		System.out.println("Age:");
		this.age = sc.nextInt();
		sc.nextLine();
		
		this.address = new Address();
		this.address.input();
	}
	
	public void StringFormat() {
		System.out.printf("%-15s %-15s", "Name", "Age");
		this.address.StringFormat();
	}
	
	public void output() {
		System.out.printf("%-15s %-15s", this.name, this.age);
		this.address.output();
	}
}
