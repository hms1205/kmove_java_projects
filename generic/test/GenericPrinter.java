package generic.test;

public class GenericPrinter<T extends Material> {
	private T matrial;

	public T getMetrial() {
		return matrial;
	}

	public void setMetrial(T matrial) {
		this.matrial = matrial;
	}
	
	public void doPrinting() {
		matrial.doPrinting();
	}
	
	public void Printing() {
		matrial.printing();
	}
}
