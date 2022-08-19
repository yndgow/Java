package ch04;

public class p094 {

	public static void main(String[] args) {
		int age = 7;
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		String schoolAge;
		schoolAge = (age>=8) ? "학교에 다닙니다." : "학교에 다니지않습니다.";
		System.out.println(schoolAge);
		
		char gender = 'F';
		if(gender == 'F') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		}
	}

}
