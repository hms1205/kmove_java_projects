package singleton.card;

public class CardCompanyTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();
		
		Card Card1 = company.createCard();
		Card Card2 = company.createCard();
		
		System.out.println("카드 고유 번호 : " + Card1.getCardNumber());
		System.out.println("카드 고유 번호 : " + Card2.getCardNumber());

	}
}
