package java0309;

public class Exam06 {
	static int var = 100;
	
	public static void main(String[] args) {
		int num1 = 100, num2 = 0;
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다. ");
			e.printStackTrace();
		}
	}
}
