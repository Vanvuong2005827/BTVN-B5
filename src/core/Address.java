package core;

import java.util.Scanner;

class Address {
	public String cummune;
	public String district;
	public String city;
	
	
	//constructor's
	public Address() {
		
	}

	public Address(String cummune, String district, String city) {
		this.cummune = cummune;
		this.district = district;
		this.city = city;
	}

	//getter's
	public String getCummune() {
		return cummune;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}
	
	//setter's
	public void setCummune(String cummune) {
		this.cummune = cummune;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void input () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("cummune name:");
		this.cummune = sc.nextLine();
		
		System.out.println("district name:");
		this.district = sc.nextLine();
		
		System.out.println("city name:");
		this.city = sc.nextLine();
	}
	
	public void StringFormat() {
		System.out.printf("%-15s %-15s %-15s","Cummune", "District", "City");
	}
	
	public void output () {
		System.out.printf("%-15s %-15s %-15s",this.cummune, this.district, this.city);
	}
	
}
