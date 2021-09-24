package entities;

public class Lead {
	
	private String name;
	private String email;
	private int phoneNumber;
	
	public Lead(String name, String email, int phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return 	name
				+ "\n"
				+ email
				+ "\n"
				+ phoneNumber
				+ "\n"
				+ "\n";
	} 						// Retirar os "[ ]" que estão aparecendo no toString final
}