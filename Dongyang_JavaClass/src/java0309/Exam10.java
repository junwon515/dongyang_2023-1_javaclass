package java0309;

public class Exam10 {
	public static void main(String[] args) {
		Tiger seoulLandTiger = new Tiger();
		Tiger tokuyoZooTiger = new Tiger();
		Eagle mongoliaEagle = new Eagle();
		
		seoulLandTiger.move();
		tokuyoZooTiger.move();
		mongoliaEagle.move();
		seoulLandTiger.eat();
		tokuyoZooTiger.eat();
		mongoliaEagle.eat();
	}
}
