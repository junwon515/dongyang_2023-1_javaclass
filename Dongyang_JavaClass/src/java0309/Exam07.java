package java0309;

public class Exam07 {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car("red", 0);
		Car jennyCar = new Car("blue", 0);
		Car eunwooCar = new Car("green", 0);
		Car junwonCar = new Car("black", 0);
		Car momCar = new Car("pink", 0);
		
		// 메소드 호출
		myCar.upSpeed(50);
		System.out.println("내차의 자동차 색상은 " + myCar.getColor() + " 속도는 " + myCar.getSpeed());
		jennyCar.upSpeed(100);
		System.out.println("제니차의 자동차 색상은 " + jennyCar.getColor() + " 속도는 " + jennyCar.getSpeed());
		eunwooCar.upSpeed(250);
		System.out.println("은우차의 자동차 색상은 " + eunwooCar.getColor() + " 속도는 " + eunwooCar.getSpeed());
		junwonCar.upSpeed(140);
		System.out.println("은우차의 자동차 색상은 " + junwonCar.getColor() + " 속도는 " + junwonCar.getSpeed());
		momCar.upSpeed(80);
		System.out.println("은우차의 자동차 색상은 " + momCar.getColor() + " 속도는 " + momCar.getSpeed());
	}
}
