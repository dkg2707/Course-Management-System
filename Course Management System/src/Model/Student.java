package Model;

public class Student extends User{
	public Student(int userId, String email, String fName, String lName, String address, String phone, int pincode, String city, String gender, String role) {
		this.userId = userId;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.phone = phone;
		this.pincode = pincode;
		this.city = city;
		this.gender = gender;
		this.role = role;
	}
	
	public Student(String email, String fName, String lName) {
		this.email = email;
		this.fName = fName;
		this.lName = lName;
	}
}
