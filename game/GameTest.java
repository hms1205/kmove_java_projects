package game;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		
		
//		player.upgrageLevel(new AdvancedLevel());
		player.upgrageLevel(new SuperLevel());
		player.play(3);
	}

}
