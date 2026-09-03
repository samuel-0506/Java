package com.javaconstructors;

public class ParameterizedCons {
	String firstName;
	String lastName;
	int age;
	String dob;
	String address;
	String carBrand;
	String model;
	String colour;
	int year;
	double price;
	String movieName;
	String hero;
	String heroine;
	String director;
	String villian;
	int yearOfRelease;
	String collections;
	String laptopBrand;
	int lapPrice;
	String ram;

	ParameterizedCons(String firstName, String lastName, int age, String dob, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.address = address;

	}

	public ParameterizedCons(String carBrand, String model, String colour, int year, double price) {
		this.carBrand = carBrand;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.price = price;
	}
	
	

	public ParameterizedCons(String movieName, String hero, String heroine, String director, String villian,
			int yearOfRelease, String collections) {
		this.movieName = movieName;
		this.hero = hero;
		this.heroine = heroine;
		this.director = director;
		this.villian = villian;
		this.yearOfRelease = yearOfRelease;
		this.collections = collections;
	}

	public ParameterizedCons(String laptopBrand, int lapPrice, String ram) {
		super();
		this.laptopBrand = laptopBrand;
		this.lapPrice = lapPrice;
		this.ram = ram;
	}

	public static void main(String[] args) {
		ParameterizedCons p = new ParameterizedCons("Samuel", "Lankalapalli", 22, "06-09-2004", "BN valasa");
		p.selfDetails();
		ParameterizedCons p2 = new ParameterizedCons("BMW","BMW-17","Black",2025,9000000);
		p2.car();
		ParameterizedCons p3 = new ParameterizedCons("Baahubali","Prabhas","Anushka","Rana","SS Rajamouli",2015,"1850 crores");
		p3.movie();
		ParameterizedCons p4 = new ParameterizedCons("HP Victus",70000,"16GB");
		p4.laptop();
	}
	

	void selfDetails() {
		System.out.println("**********Self Info**********");
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Age : " + age);
		System.out.println("Date of Birth : " + dob);
		System.out.println("Address : " + address);
		System.out.println(" ");
	}

	void car() {
		System.out.println("**********Car Info***********");
		System.out.println("Car Brand : " + carBrand);
		System.out.println("Car Model : " + model);
		System.out.println("Car Colour : " + colour);
		System.out.println("Car Launched Year : " + year);
		System.out.println("Car Price : " + price);
		System.out.println(" ");
	}
	void movie() {
		System.out.println("**********Movie Info***********");
		System.out.println("Movie Name : " + movieName);
		System.out.println("Hero : " + hero);
		System.out.println("Heroine : " + heroine);
		System.out.println("Villian : " + villian);
		System.out.println("Director : " + director);
		System.out.println("Year of Release : " + yearOfRelease);
		System.out.println("World wide Collections : " + collections);
		System.out.println(" ");
	}
	void laptop() {
		System.out.println("**********Laptop Info***********");
		System.out.println("Laptop Brand : "+laptopBrand);
		System.out.println("Price : " + lapPrice);
		System.out.println("RAM : " + ram);
	}

}
