package Project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Member {
	
	
	private String name,gender,contact,username,email,password;
	int age;
	private String membershipPlan;
	private boolean paymentStatus;
    private LocalDateTime membershipPurchaseDate;
    private LocalDate membershipExpiryDate;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public Member() {
		super();
		
	}
	
	
	public Member(String name, String gender, String contact, String username, String email, String password,
			int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.contact = contact;
		this.username = username;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "GymManagement [name=" + name + ", gender=" + gender + ", contact=" + contact + ", username=" + username
				+ ", email=" + email + ", password=" + password + ", age=" + age + "]";
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


}