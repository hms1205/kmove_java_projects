package singleton.test;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getCompany();
		Company company2 = Company.getCompany();
		System.out.println(company1);
		System.out.println(company2);
		String result = (company1 == company2) ? "������ ȸ��" : "���� �ٸ� ȸ��";
		System.out.println(result);
	}

}
