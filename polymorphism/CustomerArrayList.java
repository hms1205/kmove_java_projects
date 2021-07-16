package polymorphism;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer(10100, "ä��ȭ"));
		customerList.add(new Customer(10200, "���ͼ�"));
		customerList.add(new GoldCustomer(20100, "����ȯ"));
		customerList.add(new GoldCustomer(20200, "������"));
		customerList.add(new VIPCustomer(30100, "������", 123456));
		customerList.add(new BronzeCustomer(40100, "�����"));
		customerList.add(new BronzeCustomer(40200, "�輮��"));
		
		System.out.println("========== �� ���� ��� ==========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========== ���� �ݾװ� ����Ʈ ==========");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "������ �����ؾ� �ϴ� �ݾ��� " + cost + "�� �Դϴ�.");
			System.out.println("���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}
	}

}
