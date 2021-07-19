package abstractexam;


public class ComputerTest {

	public static void main(String[] args) {
//		Computer computer = new Computer();
		DeskTop desktop = new DeskTop();
//		NoteBook notebook = new NoteBook();
		MyNoteBook mynotebook = new MyNoteBook();
		
		desktop.typing();
		mynotebook.typing();
		
		
		Computer c1 = new DeskTop();
		Computer c2 = new MyNoteBook();
		
		c1.display();
		c2.display();
	}

}
