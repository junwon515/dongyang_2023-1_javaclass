package java0413;
//설계도 
public class Student {
	
	// 필드
	private String  name;
	private String  studentID; 
	private String  Department;
	private String  Subject;
	
	// 생성자
	public Student(String name, String studentID, String department, String subject) {
		super();
		this.name = name;
		this.studentID = studentID;
		Department = department;
		Subject = subject;
	}
	public Student() {}
	
	// getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}; 
	
	//toString() 
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentID=" + studentID + ", Department=" + Department + ", Subject=" + Subject + "]";
	}
	
}
