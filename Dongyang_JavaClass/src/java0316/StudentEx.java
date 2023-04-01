package java0316;

import java.util.ArrayList;

public class StudentEx {
	
	public static void main(String[] args) {
		// 학생 객체 생성
		Student std1 = new Student("송준원", 2022001, "컴소과", "010-1111-1111");
		Student std2 = new Student("유재석", 2022002, "디자인과", "010-2222-2222");
		Student std3 = new Student("이제니", 2022003, "컴소과", "010-3333-3333");
		Student std4 = new Student("리사", 2022004, "디자인과", "010-4444-4444");
		
		// 학생객체만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(std1);
		a1.add(std2);
		a1.add(std3);
		a1.add(std4);
		
		// 과별로 출력
		System.out.println(" **** 전체 학생 명단 **** ");
		for (Student stu : a1) {
			System.out.println(stu.getName() + " " + stu.getStuId() + " " + stu.getPhone());
		}
		System.out.println("\n **** 컴소과 학생 명단 **** ");
		for (Student stu : a1) {
			if (stu.getDept().equals("컴소과")) {
				System.out.println(stu.getName() + " " + stu.getStuId() + " " + stu.getPhone());
			}
		}
		System.out.println("\n **** 디자인과 학생 명단 **** ");
		for (Student stu : a1) {
			if (stu.getDept().equals("디자인과")) {
				System.out.println(stu.getName() + " " + stu.getStuId() + " " + stu.getPhone());
			}
		}
	}
}
