package template;

public abstract class Car {	
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("on");
	}

	public void washCar() {}
	public void wiper() {}
	
	public void stopCar() {
		System.out.println("off");
	}
	
	//하위 클래스에서 상속을 받아 사용할 때, 재 정의할 수 없음. 키워드 final 사용
	final public void run() { //정해진 일련의 흐름을 메서드로 만든 것을 템플릿 메서드라고 함.
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		stopCar();
	}
	
	
}
