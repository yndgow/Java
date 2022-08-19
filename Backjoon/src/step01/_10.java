package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 킹, 퀸, 룩, 비숍, 나이트, 폰 3003
 */
public class _10 {

	public static void main(String[] args) {
		
		int[] chess = {1, 1, 2, 2, 2,8};
		int[] putNum = new int[6];
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력");
		int num = sc.nextInt();
		
		
		for(int i=5; i>=0; i--) {
			putNum[i]= num%10;
			num = num / 10;
		}
		
		for(int i=0; i<6; i++) {
			int result = chess[i]- putNum[i];
			System.out.print(result);
		}
		sc.close();
		
	}
}
