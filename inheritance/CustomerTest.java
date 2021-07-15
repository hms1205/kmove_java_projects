package inheritance;

public class CustomerTest {

	// public, protected, default, private
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerID(1001);
		customer.setCustomerName("홍길동");
		customer.setBonusPoint(1000);
		System.out.println(customer.showCustomerInfo());
		
		VIPCustomer vipCustomer = new VIPCustomer();
		vipCustomer.setCustomerID(2001);
		vipCustomer.setCustomerName("조정석");
		vipCustomer.setBonusPoint(5000);
		System.out.println(vipCustomer.showCustomerInfo());
	}

}
