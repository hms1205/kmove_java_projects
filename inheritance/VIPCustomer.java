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
		System.out.println("VIP ������ ȣ��");
	}
	
	
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "���� ���� ID�� " + agentID + "�Դϴ�.";
	}



	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -  (int)(price * salesRatio);
	}
}
