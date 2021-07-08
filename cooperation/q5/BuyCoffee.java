package cooperation.q5;

public class BuyCoffee {

	public static void main(String[] args) {
		Person kim = new Person("Kim", 7000);
		StarCoffee starCoffee = new StarCoffee();
		kim.buyStarCoffee(starCoffee, 4000);
		kim.buyStarCoffee(starCoffee, kim.money);
		
		Person lee = new Person("Lee", 7500);
		BeanCoffee beanCoffee = new BeanCoffee();
		lee.buyBeanCoffee(beanCoffee, 4500);
		lee.buyBeanCoffee(beanCoffee, lee.money);
	}
}