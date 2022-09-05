package sub2;
/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 예외던지기 실습하기
 * 
 * 예외처리(Exception)
 *  - 예외는 프로그램 실행중에 발생하는 모든 오류(Error)
 *  - 실행중에 발생하는 오류를 대처하고 안정적인 프로그램 개발을 위해 예외처리 수행
 */
public class ThrowTest {
	public static void main(String[] args) {
		
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1, 2);
		int r2 = cal.minus(1, 2);
		int r3 = 0;
		int r4 = 0;
		
		try {
			r3 = cal.multi(2, 0);
			r4 = cal.div(4, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
	}
}
