package game.tbd;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		player.upgrageLevel(new AdvancedLevel());
		player.play(2);
		
		player.upgrageLevel(new SuperLevel());
		player.play(3);
	}

}
