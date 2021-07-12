package singleton.test;

public class Company {
	private static Company company = new Company();
	
	private Company() {
		System.out.println("Company()");
	}
	
	public static Company getCompany() {
		return company;
	}
}
