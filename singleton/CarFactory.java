package singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
		System.out.println("CarFactory() 생성자 호출");
	}
	
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		
		return car;
	}

}
