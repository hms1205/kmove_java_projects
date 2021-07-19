package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("[수동 주행 차]");
		ManualCar car1 = new ManualCar();
		car1.run();
		
		System.out.println("[자율 주행 차]");
		Car car2 = new AICar();
		car2.run();
	}

}
