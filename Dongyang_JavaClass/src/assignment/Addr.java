package assignment;
//설계도

import java.time.LocalDateTime;

public class Addr {
	//필드
	private String name;				//이름
	private String tel;					//전화번호
	private String com;					//회사명
	private LocalDateTime createDate;
	//생성자
	public Addr() {};
	public Addr(String name, String tel, String com, LocalDateTime createDate) {
		super();
		this.name = name;
		this.tel = tel;
		this.com = com;
		this.createDate = createDate;
	}
	//메소드
	@Override
	public String toString() {
		return "Addr [name=" + name + ", tel=" + tel + ", com=" + com + ", createDate=" + createDate + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setCreate(LocalDateTime createDate) {
		this.createDate = createDate;
	} 
}
