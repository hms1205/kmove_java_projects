package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 예외 처리 블록");
			System.out.println(e.getMessage());
			
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("finally");
		}
		
		System.out.println("END");
	}

}
