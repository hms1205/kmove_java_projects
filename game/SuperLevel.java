package game;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돌 수 있습니다.");
	}

	@Override
	public void showLevleMessage() {
		System.out.println("********** 고급자 레벨 **********");
	}

}
