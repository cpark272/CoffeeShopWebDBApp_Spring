package co.grandcircus.CoffeeShopWebApplication;

public class User {
	
	// Instance variables for User class
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String password;
//	private String birthday;
	
	// Created by using Generate Constructor using Fields
	public User(String firstName, String lastName, String email, int phone, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
//		this.birthday = birthday;
		
	}

	// Created using Generate Constructors from Superclass
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Created from Generate Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Created from Generate toString()
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}

}
