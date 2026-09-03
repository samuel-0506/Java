package com.javapractice;

import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		System.out.println("-------Personal Details------- ");
		System.out.println(" ");

		PersonalDetails pd = new PersonalDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println(" First Name : ");
		String fName = sc.nextLine();

		System.out.println(" Last Name : ");
		String lName = sc.nextLine();

		System.out.println(" Height : ");
		int height = sc.nextInt();

		System.out.println("Enter weight : ");
		double weight = sc.nextDouble();
		
		System.out.println("Date of Birth : ");
		sc.nextLine();
		String dateOfBirth = sc.nextLine();

		System.out.println("Gender : ");
		char gender = sc.next().charAt(0);

		System.out.println("Mobile Number : ");
		long mobileNumber = sc.nextLong();

		System.out.println("Email : ");
		sc.nextLine();
		String email = sc.nextLine();

		System.out.println("Address : ");
		String address = sc.nextLine();

		System.out.println("City : ");
		String city = sc.nextLine();

		System.out.println("State : ");
		String state = sc.nextLine();

		System.out.println("Country : ");
		String country = sc.nextLine();

		System.out.println("Pincode : ");
		int pincode = sc.nextInt();

		System.out.println("Nationality : ");
		sc.nextLine();
		String nationality = sc.nextLine();

		System.out.println("Blood Group : ");
		String bloodGroup = sc.nextLine();

		System.out.println("Marital Status : ");
		String maritalStatus = sc.nextLine();

		System.out.println("Religion : ");
		String religion = sc.nextLine();

		System.out.println("Mother Tongue : ");
		String motherTongue = sc.nextLine();

		System.out.println("Qualification : ");
		String qualification = sc.nextLine();

		System.out.println("College Name : ");
		String collegeName = sc.nextLine();

		System.out.println("University : ");
		String university = sc.nextLine();

		System.out.println("Branch : ");
		String branch = sc.nextLine();

		System.out.println("CGPA : ");
		float cgpa = sc.nextFloat();

		System.out.println("Percentage : ");
		double percentage = sc.nextDouble();

		System.out.println("Roll Number : ");
		int rollNumber = sc.nextInt();

		System.out.println("Employee ID : ");
		int employeeId = sc.nextInt();

		System.out.println("Salary : ");
		double salary = sc.nextDouble();

		System.out.println("Experience : ");
		float experience = sc.nextFloat();

		System.out.println("Occupation : ");
		sc.nextLine();
		String occupation = sc.nextLine();

		System.out.println("Company Name : ");
		String companyName = sc.nextLine();

		System.out.println("Department : ");
		String department = sc.nextLine();

		System.out.println("Designation : ");
		String designation = sc.nextLine();

		System.out.println("Passport Number : ");
		String passportNumber = sc.nextLine();

		System.out.println("Aadhar Number : ");
		long aadharNumber = sc.nextLong();

		System.out.println("PAN Number : ");
		sc.nextLine();
		String panNumber = sc.nextLine();
		
		System.out.println("Driving License : ");
		String drivingLicense = sc.nextLine();
		pd.drivingLicense(drivingLicense);

		System.out.println("Voter ID : ");
		String voterId = sc.nextLine();

		System.out.println("Passport Available  : ");
		boolean passportAvailable = sc.nextBoolean();

		System.out.println("Driving License Available  : ");
		boolean drivingLicenseAvailable = sc.nextBoolean();

		System.out.println("Hobbies : ");
		String hobbies = sc.nextLine();

		System.out.println("Favorite Color : ");
		String favoriteColor = sc.nextLine();

		System.out.println("Favorite Food : ");
		String favoriteFood = sc.nextLine();

		System.out.println("Favorite Movie : ");
		String favoriteMovie = sc.nextLine();

		System.out.println("Favorite Sport : ");
		String favoriteSport = sc.nextLine();

		System.out.println("Favorite Book : ");
		String favoriteBook = sc.nextLine();

		System.out.println("Skills : ");
		String skills = sc.nextLine();

		System.out.println("Languages Known : ");
		String languagesKnown = sc.nextLine();

		System.out.println("Employed : ");
		boolean isEmployed = sc.nextBoolean();

		System.out.println("Married : ");
		boolean isMarried = sc.nextBoolean();

		System.out.println("Has Vehicle : ");
		boolean hasVehicle = sc.nextBoolean();

		System.out.println("Vehicle Number : ");
		sc.nextLine();
		String vehicleNumber = sc.nextLine();

		System.out.println("Annual Income : ");
		double annualIncome = sc.nextDouble();

		System.out.println("Account Balance : ");
		double accountBalance = sc.nextDouble();

		System.out.println("Emergency Contact : ");
		long emergencyContact = sc.nextLong();

		pd.name(fName, lName);
		pd.mheight(height);
		pd.mweight(weight);
		pd.dateOfBirth(dateOfBirth);
		pd.gender(gender);
		pd.mobileNumber(mobileNumber);
		pd.email(email);
		pd.address(address);
		pd.city(city);
		pd.state(state);
		pd.country(country);
		pd.pincode(pincode);
		pd.nationality(nationality);
		pd.bloodGroup(bloodGroup);
		pd.maritalStatus(maritalStatus);
		pd.religion(religion);
		pd.motherTongue(motherTongue);
		pd.qualification(qualification);
		pd.collegeName(collegeName);
		pd.university(university);
		pd.branch(branch);
		pd.cgpa(cgpa);
		pd.percentage(percentage);
		pd.rollNumber(rollNumber);
		pd.employeeId(employeeId);
		pd.occupation(occupation);
		pd.companyName(companyName);
		pd.salary(salary);
		pd.experience(experience);
		pd.department(department);
		pd.designation(designation);
		pd.passportNumber(passportNumber);
		pd.aadharNumber(aadharNumber);
		pd.panNumber(panNumber);
		pd.drivingLicense(drivingLicense);
		pd.voterId(voterId);
		pd.passportAvailable(passportAvailable);
		pd.drivingLicenseAvailable(drivingLicenseAvailable);
		pd.hobbies(hobbies);
		pd.favoriteColor(favoriteColor);
		pd.favoriteFood(favoriteFood);
		pd.favoriteMovie(favoriteMovie);
		pd.favoriteSport(favoriteSport);
		pd.favoriteBook(favoriteBook);
		pd.skills(skills);
		pd.languagesKnown(languagesKnown);
		pd.isEmployed(isEmployed);
		pd.isMarried(isMarried);
		pd.hasVehicle(hasVehicle);
		pd.vehicleNumber(vehicleNumber);
		pd.annualIncome(annualIncome);
		pd.accountBalance(accountBalance);
		pd.emergencyContact(emergencyContact);

	}

	void name(String fName, String lName) {
		System.out.println(" Full Name  : " + fName + " " + lName); // 1
	}

	void mheight(int height) {
		System.out.println(" Height  : " + height); // 2
	}

	void mweight(double weight) {
		System.out.println(" Weight  : " + weight); // 3
	}

	void age(int age) {
		System.out.println(" Age  : " + age); // 4
	}

	void colour(String colour) {
		System.out.println(" Full Name  : " + colour); // 5
	}

	void gender(char gender) {
		System.out.println("Gender : " + gender); // 6
	}

	void mobileNumber(long mobileNumber) {
		System.out.println("Mobile Number : " + mobileNumber); // 7
	}

	void email(String email) {
		System.out.println("Email : " + email); // 8
	}

	void address(String address) {
		System.out.println("Address : " + address); // 9
	}

	void city(String city) {
		System.out.println("City : " + city); // 10
	}

	void state(String state) {
		System.out.println("State : " + state); // 11
	}

	void country(String country) {
		System.out.println("Country : " + country); // 12
	}

	void pincode(int pincode) {
		System.out.println("Pincode : " + pincode); // 13
	}

	void nationality(String nationality) {
		System.out.println("Nationality : " + nationality); // 14
	}

	void bloodGroup(String bloodGroup) {
		System.out.println("Blood Group : " + bloodGroup); // 15
	}

	void maritalStatus(String maritalStatus) {
		System.out.println("Marital Status : " + maritalStatus); // 16
	}

	void religion(String religion) {
		System.out.println("Religion : " + religion); // 17
	}

	void motherTongue(String motherTongue) {
		System.out.println("Mother Tongue : " + motherTongue); // 18
	}

	void qualification(String qualification) {
		System.out.println("Qualification : " + qualification); // 19
	}

	void collegeName(String collegeName) {
		System.out.println("College Name : " + collegeName); // 20
	}

	void university(String university) {
		System.out.println("University : " + university); // 21
	}

	void branch(String branch) {
		System.out.println("Branch : " + branch); // 22
	}

	void cgpa(float cgpa) {
		System.out.println("CGPA : " + cgpa); // 23
	}

	void percentage(double percentage) {
		System.out.println("Percentage : " + percentage); // 24
	}

	void rollNumber(int rollNumber) {
		System.out.println("Roll Number : " + rollNumber); // 25
	}

	void employeeId(int employeeId) {
		System.out.println("Employee ID : " + employeeId); // 26
	}

	void occupation(String occupation) {
		System.out.println("Occupation : " + occupation); // 27
	}

	void companyName(String companyName) {
		System.out.println("Company Name : " + companyName); // 28
	}

	void salary(double salary) {
		System.out.println("Salary : " + salary); // 29
	}

	void experience(float experience) {
		System.out.println("Experience : " + experience); // 30
	}

	void department(String department) {
		System.out.println("Department : " + department); // 31
	}

	void designation(String designation) {
		System.out.println("Designation : " + designation); // 32
	}

	void passportNumber(String passportNumber) {
		System.out.println("Passport Number : " + passportNumber); // 33
	}

	void aadharNumber(long aadharNumber) {
		System.out.println("Aadhar Number : " + aadharNumber); // 34
	}

	void panNumber(String panNumber) {
		System.out.println("PAN Number : " + panNumber); // 35
	}

	void drivingLicense(String drivingLicense) {
		System.out.println("Driving License : " + drivingLicense); // 36
	}

	void voterId(String voterId) {
		System.out.println("Voter ID : " + voterId); // 37
	}

	void passportAvailable(boolean passportAvailable) {
		System.out.println("Passport Available : " + passportAvailable); // 38
	}

	void drivingLicenseAvailable(boolean drivingLicenseAvailable) {
		System.out.println("Driving License Available : " + drivingLicenseAvailable); // 39
	}

	void hobbies(String hobbies) {
		System.out.println("Hobbies : " + hobbies); // 40
	}

	void favoriteColor(String favoriteColor) {
		System.out.println("Favorite Color : " + favoriteColor); // 41
	}

	void favoriteFood(String favoriteFood) {
		System.out.println("Favorite Food : " + favoriteFood); // 42
	}

	void favoriteMovie(String favoriteMovie) {
		System.out.println("Favorite Movie : " + favoriteMovie); // 43
	}

	void favoriteSport(String favoriteSport) {
		System.out.println("Favorite Sport : " + favoriteSport); // 44
	}

	void favoriteBook(String favoriteBook) {
		System.out.println("Favorite Book : " + favoriteBook); // 45
	}

	void skills(String skills) {
		System.out.println("Skills : " + skills); // 46
	}

	void languagesKnown(String languagesKnown) {
		System.out.println("Languages Known : " + languagesKnown); // 47
	}

	void isEmployed(boolean isEmployed) {
		System.out.println("Employed : " + isEmployed); // 48
	}

	void isMarried(boolean isMarried) {
		System.out.println("Married : " + isMarried); // 49
	}

	void hasVehicle(boolean hasVehicle) {
		System.out.println("Has Vehicle : " + hasVehicle); // 50
	}

	void vehicleNumber(String vehicleNumber) {
		System.out.println("Vehicle Number : " + vehicleNumber); // 51
	}

	void annualIncome(double annualIncome) {
		System.out.println("Annual Income : " + annualIncome); // 52
	}

	void accountBalance(double accountBalance) {
		System.out.println("Account Balance : " + accountBalance); // 53
	}

	void emergencyContact(long emergencyContact) {
		System.out.println("Emergency Contact : " + emergencyContact);// 54
	}

	void dateOfBirth(String dateOfBirth) {
		System.out.println("Date of Birth : " + dateOfBirth); // 55
	}
}