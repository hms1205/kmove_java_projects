package game;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("돌 수 없습니다.");
	}

	@Override
	public void showLevleMessage() {
		System.out.println("********** 초급자 레벨 **********");
	}

}
