package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 직접 운전을 합니다.");
		System.out.println("사람이 핸들을 직접 조종합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 직접 밟아 정차합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절합니다.");
	}
	
}
