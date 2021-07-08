package cooperation.q5;

public class Person {
	String name;
	int money;
	
	public Person(String Name, int money) {
		this.name = Name;
		this.money = money;
	}

	public void buyStarCoffee(StarCoffee starCoffee, int money) {
		starCoffee.take(4000); // ��Ÿ���� ���� �߰�
		
		if(this.money >= 4000) {
			this.money -= 4000;
			System.out.println(this.name + "���� 4000������ ���ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.");
			starCoffee.showInfo();
		} else {
			System.out.println(this.name + "���� " + this.money + "������ ���� �����Ͽ� �Ƹ޸�ī�븦 ���� ���� �����~ �Ф�");
		}
	}

	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		beanCoffee.take(4500); // ��ٹ� ���� �߰�
		
		if(this.money >= 4500) {
			this.money -= 4500;
			System.out.println(this.name + "���� 4500������ ��ٹ� �󶼸� �����߽��ϴ�.");
			beanCoffee.showInfo();
		} else {
			System.out.println(this.name + "���� " + this.money + "������ ���� �����Ͽ� �󶼸� ���� ���� �����~ �Ф�");
		}
	}
}