package generic.test;

public abstract class Material {
	public abstract void doPrinting();
	public void printing() {
		System.out.println("프린터기에 투입한 " + getClass().getSimpleName() + "재료로 출력합니다...");
	}
}
