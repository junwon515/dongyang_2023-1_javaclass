package java0413;

public class LoginInformation {
	// 필드
	private String email;
	private String password;
	
	// 생성자
	public LoginInformation(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginInformation() {}
	
	// 메소드
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
	
}
