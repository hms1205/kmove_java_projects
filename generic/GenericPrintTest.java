package generic;

public class GenericPrintTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMetrial(new Powder());
		
		Powder powder = powderPrinter.getMetrial();
		
		System.out.println(powder);
		powder.doPrinting();
		powder.printing();
		
		GenericPrinter plasticPrinter = new GenericPrinter();
		
		plasticPrinter.setMetrial(new Plastic());
		Plastic plastic = (Plastic) plasticPrinter.getMetrial();
		
		System.out.println(plastic);
		plastic.doPrinting();
		
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		waterPrinter.setMetrial(new Water());
		Water water = waterPrinter.getMetrial();
		System.out.println(water);
		water.doPrinting();
	}

}
