package ch08;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() +
				"님이 지불해야하는 금액은 " +
				customerLee.calcPrice(price) +
				"원 입니다."
				);
		
		VIPCustomer customeKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customeKim.getCustomerName() +
				"님이 지불해야하는 금액은 " +
				customeKim.calcPrice(price) +
				"원 입니다."
				);
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() +
				"님이 지불해야하는 금액은 " +
				vc.calcPrice(price) +
				"원 입니다."
				);
		
	}
}
