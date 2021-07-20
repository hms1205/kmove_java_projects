package game;

public class Player {
	private PlayerLevel level;

	public Player( ) {
		level = new BeginnerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgrageLevel(PlayerLevel level) {
		this.level = level;
		level.showLevleMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
