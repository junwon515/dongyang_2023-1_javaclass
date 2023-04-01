package java0309;

public class Eagle extends Animal implements IAnimal {
	String home;

	@Override
	void move() {
		System.out.println("날개로 날아간다.");
	}

	@Override
	public void eat() {
		System.out.println("생선을 좋아한다.");
	}
}
