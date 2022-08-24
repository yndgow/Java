package ch05;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order();
		
		order1.orderNum = "201803120001";
		order1.cId = "abc123";
		order1.cDate = "2018년 3월 12일";
		order1.cName = "홍길순";
		order1.proNum = "PD0345-12";
		order1.addr = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order1.getOrderNum());
		System.out.println("주문자 아이디 : " + order1.getcId());
		System.out.println("주문 날짜 : " + order1.getcDate());
		System.out.println("주문자 이름 : " + order1.getcName());
		System.out.println("주문 상품 번호 : " + order1.getProNum());
		System.out.println("배송 주소 : " + order1.getAddr());
	}

}
