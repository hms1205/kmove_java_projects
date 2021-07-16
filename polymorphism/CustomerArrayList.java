package polymorphism;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer(10100, "채송화"));
		customerList.add(new Customer(10200, "이익순"));
		customerList.add(new GoldCustomer(20100, "김준환"));
		customerList.add(new GoldCustomer(20200, "이익준"));
		customerList.add(new VIPCustomer(30100, "안정원", 123456));
		customerList.add(new BronzeCustomer(40100, "정상욱"));
		customerList.add(new BronzeCustomer(40200, "김석재"));
		
		System.out.println("========== 고객 정보 출력 ==========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========== 지불 금액과 포인트 ==========");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "고객님이 지불해야 하는 금액은 " + cost + "원 입니다.");
			System.out.println("보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		}
	}

}
