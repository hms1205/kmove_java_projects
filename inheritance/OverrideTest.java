package inheritance;

public class OverrideTest {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "아몰랑", 2345);
		vc.bonusPoint = 1000;
		System.out.println(
		vc.showCustomerInfo());
		
		int cost = vc.calcPrice(10000);
		
		System.out.println(vc.getCustomerName() + "고객님의 지불 금액은 " + cost + "원이고, 보너스 포인트는 " + vc.bonusPoint + "입니다.");
	}

}
