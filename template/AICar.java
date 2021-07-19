package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행 자동차가 운행을 합니다.");
		System.out.println("자동차가 알아서 장해물을 피하고, 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("알아서 스스로 멈춥니다.");
	}

	@Override
	public void washCar() {
		System.out.println("차가 더러워지면 알아서 세차장으로 가서 세차합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
	}

}
