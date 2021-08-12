package exception;

public class login {
	private String userID;
	private String userPW;
	
	
	
	public String getUserID() {
		return userID;
	}



	public String getUserPW() {
		return userPW;
	}

	public static void logintest(String userID, String userPW) throws NotExistException, WrongPasswordException {
		if(!userID.equals("white")) {
			throw new NotExistException("아이디가 존재하지 않습니다.");
		}
		if(!userPW.equals("123456")) {
			throw new WrongPasswordException("잘못된 비밀번호 입니다.");
		}
		System.out.println("login OK");
	}

	public static void main(String[] args) {
		try {
			login.logintest("white1", "123455");
		} catch (WrongPasswordException e1) {
			System.out.println(e1.getMessage());
		} catch(NotExistException e2) {
			System.out.println(e2.getMessage());
		}
		
		try {
			login.logintest("black", "123456");
		} catch (NotExistException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e);
		}
		
		try {
			login.logintest("white", "123456");
		} catch (NotExistException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login.logintest(null, null);
		} catch (NotExistException e) {
			System.out.println(e.getMessage());
		} catch (WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
