package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void main(String[] args) {
		ThrowsException exp = new ThrowsException();
		
		try {
			exp.loadClass("b.txt", "exception.AutoCloseObject");
			// 강제 예외 발생
			throw new Exception("또 다른 강제 예외를 발생시킴.");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("발생한 강제 예외를 처리");
		}
		System.out.println("END");
	}
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class returnClass = Class.forName(className);
		return returnClass;
	}

}
