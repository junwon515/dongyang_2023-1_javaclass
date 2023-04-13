package java0413;

public class Login {
	
	// 필드
	private String email;
	private String password;
	
	// 생성자
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Login() {}
	
	// getter, setter
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
	
	// toString()
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}
		
	
}
