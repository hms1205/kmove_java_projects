package polymorphism;

public class BronzeCustomer extends Customer {
	private double salesRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//	}
	
	public BronzeCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.03;
		salesRatio = 0.05;
		System.out.println("Bronze 생성자 호출");
	}
	
	
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}


	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -  (int)(price * salesRatio);
	}
}
