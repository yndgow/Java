package ch04;

public class p119 {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) continue;
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
		
		int num1;
		for(num1=1; num1<=100; num1++) {
			if(num1 % 3 != 0) continue;
			System.out.println(num1);
		}
	}
}
