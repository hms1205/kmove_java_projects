package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		System.out.println(company1);
		System.out.println(company2);
		String result = (company1 == company2) ? "유일한 회사" : "서로 다른 회사";
		System.out.println(result);
	}

}
