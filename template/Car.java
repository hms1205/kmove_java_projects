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
	
	//���� Ŭ�������� ����� �޾� ����� ��, �� ������ �� ����. Ű���� final ���
	final public void run() { //������ �Ϸ��� �帧�� �޼���� ���� ���� ���ø� �޼����� ��.
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		stopCar();
	}
	
	
}
