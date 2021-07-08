package cooperation.q5;

public class Person {
	String name;
	int money;
	
	public Person(String Name, int money) {
		this.name = Name;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		starCoffee.take(4000); // 스타벅스 매출 추가
		
		if(this.money >= 4000) {
			this.money -= 4000;
			System.out.println(this.name + "님이 4000원으로 별다방 아메리카노를 구입했습니다.");
			starCoffee.showInfo();
		} else {
			System.out.println(this.name + "님이 " + this.money + "원으로 돈이 부족하여 아메리카노를 마실 수가 없어요~ ㅠㅠ");
		}
	}

	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		beanCoffee.take(4500); // 콩다방 매출 추가
		
		if(this.money >= 4500) {
			this.money -= 4500;
			System.out.println(this.name + "님이 4500원으로 콩다방 라떼를 구입했습니다.");
			beanCoffee.showInfo();
		} else {
			System.out.println(this.name + "님이 " + this.money + "원으로 돈이 부족하여 라떼를 마실 수가 없어요~ ㅠㅠ");
		}
	}
}