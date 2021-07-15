package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	private double salesRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//	}
	
	public VIPCustomer(int customerID, String customerName, int agentId) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		agentID = agentId;
		System.out.println("VIP 생성자 호출");
	}
	
	
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "전문 상담원 ID는 " + agentID + "입니다.";
	}



	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -  (int)(price * salesRatio);
	}
}
