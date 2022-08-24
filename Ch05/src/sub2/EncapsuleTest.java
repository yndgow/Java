package sub2;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김지홍
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(Encapsulation)
 *  - 캡슐화는 객체의 속성(필드)을 외부엇 참조하지 못하도록 객체의 정보를 은닉하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 *  - 은닉된 정보의 안전한 참조를 위해 Getter, Setter를 정의한다.
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		// Setter를 통한 속성 변경 
		sonata.setColor("은색");
		
		// 기능
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// Account 객체 생성과 초기화
		Account nh = new Account("농협", "101-12-1110", "강감찬", 0);
		nh.deposit(100000);
		nh.withdraw(25000);
		nh.show();
	}
}
