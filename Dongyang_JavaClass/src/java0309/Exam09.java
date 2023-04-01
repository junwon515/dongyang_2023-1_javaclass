package java0309;

public class Exam09 {
	public static void main(String[] args) {
		// 객체 생성
		Automobile myRidingCar = new Automobile();
		
		// 메소드 호출
		myRidingCar.upSpeed(250);
		myRidingCar.setColor("orange");
		System.out.println("내 승용차의 색상은 " + myRidingCar.getColor());
	} 
}
