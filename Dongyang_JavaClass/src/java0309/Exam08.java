package java0309;

import java.lang.Math;

public class Exam08 {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car("red", 0);
		Car jennyCar = new Car("blue", 0);
		Car eunwooCar = new Car("green", 0);
		Car junwonCar = new Car("black", 0);
		Car momCar = new Car("pink", 0);
		
		// 메소드 호출
		System.out.println("생산된 차의 대수(정적 필드) ==>" + Car.carCount);
		System.out.println("차의 최고 제한 속도 ==>" + Car.MAXSPEED);
		
		// Math 메소드 호출
		System.out.println("PI의 값 ==>" + Math.PI);
		System.out.println("3의 5제곱 ==>" + Math.pow(3, 5));
	}
}
