package java0406;

public class Student {
	// 필드
	private String name;
	private int studentID;
	private String department;
	private String subject;
	
	// 생성자
	public Student(String name, int studentID, String department, String subject) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.department = department;
		this.subject = subject;
	}
	public Student() {}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
