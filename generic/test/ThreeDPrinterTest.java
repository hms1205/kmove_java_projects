package generic.test;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder powder = new Powder();
		
		printer.setMetrial(powder);
		
		Powder obj = (Powder) printer.getMetrial();
		System.out.println(obj);
	}

}
