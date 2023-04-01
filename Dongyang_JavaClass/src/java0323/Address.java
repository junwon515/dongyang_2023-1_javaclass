package java0323;

import java.time.LocalDateTime;

public class Address {
	// 필드
	private String naem;
	private String tel;
	private String com;
	private LocalDateTime createDate;
	
	// 생성자
	public Address(String naem, String tel, String com, LocalDateTime createDate) {
		super();
		this.naem = naem;
		this.tel = tel;
		this.com = com;
		this.createDate = createDate;
	}
	public Address() {}
	
	// 메소드
	public String getNaem() {
		return naem;
	}
	public void setNaem(String naem) {
		this.naem = naem;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	
	
}
