package template;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("����� ���� ������ �մϴ�.");
		System.out.println("����� �ڵ��� ���� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("����� ���� ��� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("����� �����⸦ �����մϴ�.");
	}
	
}