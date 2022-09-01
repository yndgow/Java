package sub02;
/*
 * 날짜 : 2022/09/01/
 * 이름 : 김지홍
 * 내용 : 인터페이스 실습하기
 */

public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스로 공통 클래스 구조설계
		Car sonata = new Sedan("소나타", "검정색", 0);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		Car bongo = new Truck("봉고", "하얀색", 0);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
	}
}
