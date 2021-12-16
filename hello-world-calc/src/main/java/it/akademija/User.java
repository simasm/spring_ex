package it.akademija;

public final class User {

	private String username;
	private String firstName;
	private String email;
	
	public User() { }
	public User(String username, String firstName, String email) {
		this.username = username;
		this.firstName = firstName;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
