package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("[���� ���� ��]");
		ManualCar car1 = new ManualCar();
		car1.run();
		
		System.out.println("[���� ���� ��]");
		Car car2 = new AICar();
		car2.run();
	}

}
