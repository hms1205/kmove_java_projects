package game;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("������ �� �����ϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�� �� �����ϴ�.");
	}

	@Override
	public void showLevleMessage() {
		System.out.println("********** �ʱ��� ���� **********");
	}

}
