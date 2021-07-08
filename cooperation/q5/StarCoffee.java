package cooperation.q5;

public class StarCoffee {
	int money;
	
	
	public void take(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println("¼öÀÔ : " + money);
	}
}
