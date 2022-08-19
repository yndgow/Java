package ch04;

public class p114 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		int j=0;
		for( ; j<=10; j++) {
			System.out.println("안녕하세요"+j);
		}
	}
}
