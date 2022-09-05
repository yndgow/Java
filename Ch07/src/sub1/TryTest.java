package sub1;
/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 예외처리실습하기
 */
public class TryTest {
	public static void main(String[] args) {
		// 예외상황1 : 어떤 수를 0로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try {
			// 예외가 발생할 수 있는 코드로직
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		}catch(ArithmeticException e) {
			// 예외가 발생했을때 처리할 코드로직
			e.printStackTrace();
		}
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		// 예외상황2 : 배열 인덱스 범위를 벗어났을 때
		int [] arr = {1,2,3,4,5};
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("arr[i] : " + arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황3 : NULL 포인트 참조
		Animal animal = null;
		
		try {
			animal.move();
			animal.hunt();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		// 예외상황4 : Casting 에러
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		
		try {
			Eagle eagle = (Eagle)a1; // 다운캐스팅
			eagle.move();
			eagle.hunt();
		} catch (ClassCastException e) {
			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();
		}finally {
			// 정리코드
			System.out.println("캐스팅 완료..");
		}
		
		
		
		
		System.out.println("프로그램 종료..");
	}
}
