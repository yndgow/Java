package ch14.exception;

public class PWFormatTest {
	private String uPw;
	
	public void setuPw(String uPw) throws PWFormatException{
		if(uPw == null) {
			throw new PWFormatException("비밀번호는 null이 안됩니다.");
		}else if(uPw.matches("[a-zA-Z]+")) {
			throw new PWFormatException("비밀번호는 문자열+숫자 여야합니다.");
		}else if(uPw.length() <= 5) {
			throw new PWFormatException("비밀번호는 6자 이상이어야 합니다.");
		}
		
		this.uPw = uPw;
	}
	
	
	public static void main(String[] args) {
		String pass1 = null;
		String pass2 = "abcdefg";
		String pass3 = "abc1";
		
		
		PWFormatTest pwt = new PWFormatTest();
		try {
			pwt.setuPw(pass1);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pwt.setuPw(pass2);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pwt.setuPw(pass3);
		} catch (PWFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
