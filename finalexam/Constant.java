package finalexam;

public class Constant {
	int num = 100;
	final int NUM = 200;
	
	public static void main(String[] args) {
		Constant constant = new Constant();
		
		System.out.println(constant.num);
		constant.num = 300;
		System.out.println(constant.num);
		
		System.out.println(constant.NUM);
//		System.out.println(Constant.NUM);
	}
}
