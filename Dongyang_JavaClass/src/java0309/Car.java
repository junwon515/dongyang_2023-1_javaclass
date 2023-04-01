package java0309;

public class Car {
	private String color;
	private int speed = 0;
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	// 생산자
	public Car () {}
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
		carCount++;
	}
	
	// get set
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// up down Speed
	void upSpeed(int value) {
		if (speed + value >= MAXSPEED)
			speed = MAXSPEED;
		else
			speed += value;
	}

	void downSpeed(int value) {
		if (speed - value <= MINSPEED)
			speed = MINSPEED;
		else
			speed -= value;
	}
}
