package Project;

import java.time.LocalDate;

public class Trainer {

	private String name;
	private String specialization;
	private String contact;
	private String username;
	private String password;
	
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", specialization=" + specialization + ", contact=" + contact + ", username="
				+ username + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(String name, String specialization, String contact, String username, String password) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.contact = contact;
		this.username = username;
		this.password = password;
	}
	
	
}
