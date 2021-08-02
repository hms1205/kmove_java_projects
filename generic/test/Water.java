package generic.test;

public class Water extends Material {

	@Override
	public void doPrinting() {
		System.out.println("Water 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료가 Water 입니다.";
	}

}
