package game;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 수 있습니다.");
	}

	@Override
	public void turn() {
		System.out.println("돌 수 없습니다.");
	}

	@Override
	public void showLevleMessage() {
		System.out.println("********** 고급자 레벨 **********");
	}

}
