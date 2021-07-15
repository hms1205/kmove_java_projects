package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customer = new Customer(1001, "홍길동");
		VIPCustomer vipCustomer = new VIPCustomer(2001, "조정석", 10000);
		Customer customer2 = vipCustomer;
		
		System.out.println(customer.showCustomerInfo());
		System.out.println(vipCustomer.showCustomerInfo());
	}

}
