package cooperation.q5;

public class BeanCoffee {
	int money;

	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("���� : " + money);
	}
}
