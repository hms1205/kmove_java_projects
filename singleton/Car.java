package singleton;

public class Car {
	
	private static int serialNo = 10000;
	private int carNum;
	
	public Car() {
		System.out.println("Car() 생성자 호출");
		carNum = ++serialNo;
	}

	public int getCarNum() {
		
		return carNum;
	}

}
