package sub3;

/*
날짜 : 2022/08/17
이름 : 김지홍
내용 : Java 조건문 For 실습하기
*/
public class ForTest2 {	
	
	public static void main(String[] args) {
		// 1부터 10까지의 합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
		
		//1부터 10까지 짝수의 합
		int tot = 0;
		for(int k=1; k<=10; k++) {
			if(k % 2 ==0) {
				tot += k;
			}
//			tot = (k % 2) == 0 ? tot += k : tot;
		}
		System.out.println("1부터 10까지 짝수의 합은 " + tot + "입니다.");
		
		//중첩 for
		
		for(int a=1; a<=3; a++) {
			System.out.println("a : " + a);
			for(int b=1; b<=5; b++) {
				System.out.println("b : " + b);
			}
		}

		//구구단
//		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		int x =1;
		for(int x=2; x<=9; x++) {
//			System.out.println(x + "단");
			for(int y=1; y<=9; y++) {
				int z = (x * y);
				System.out.println(x + "x" + y +"=" + z);
			}
		}
		
		
		//별삼각형
		for(int start=1; start <=10; start++) {
			for(int end=1; end<=start; end++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
		for(int start1=10; start1 >=1; start1--) {
			for(int end1=1; end1<=start1; end1++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
//		for(int s=1; s<=5; s++){
//			for(int r=1; r<=5-s; r++) {
//				System.out.print("☆");
//			}
//			System.out.println("★");
//		}
	}
}
