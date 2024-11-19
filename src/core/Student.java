package core;

import java.util.Scanner;

public class Student extends Person {
	public int id;
	public String nameClass;
	public float gpa;
	public final float criteria = 2;
	
	//constructor's
	public Student() {
		
	}

	public Student(int id, String nameClass, float gpa) {
		this.id = id;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}
	
	//getter's

	public int getId() {
		return id;
	}

	public String getNameClass() {
		return nameClass;
	}

	public float getGpa() {
		return gpa;
	}

	public float getCriteria() {
		return criteria;
	}

	//setter's
	public void setId(int id) {
		this.id = id;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID:");
		this.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("nameClass:");
		this.nameClass = sc.nextLine();
		
		System.out.println("GPA:");
		this.gpa = sc.nextFloat();
		sc.nextLine();
	}
	
	public void StringFormat() {
		super.StringFormat();
		System.out.printf("%-15s %-15s %15s \n", "ID", "NameClass", "GPA");
	}
	
	public void output() {
		super.output();
		System.out.printf("%-15d %-15s %15.2f \n", this.id, this.nameClass, this.gpa);
	}
	
	public boolean checkFail() {
		return ((gpa < criteria) ? true : false);
	}
}
