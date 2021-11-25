
public class Email {

	String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.contains("@"))
			this.email = email;
	}
	
	public String GetDomain() {
		return getEmail().split("@")[1];
	}

	public Email(String email) {
		setEmail(email);
	}

	@Override
	public String toString() {
		return email;
	}
	
	

}
