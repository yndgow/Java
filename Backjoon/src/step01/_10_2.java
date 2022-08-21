package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 킹, 퀸, 룩, 비숍, 나이트, 폰 3003
 */
public class _10_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		int num1 = sc.nextInt();	
		int num2 = sc.nextInt();	
		int num3 = sc.nextInt();	
		int num4 = sc.nextInt();	
		int num5 = sc.nextInt();	
		int num6 = sc.nextInt();	
		
		int king = 1-num1;
		int queen = 1-num2;
		int rook = 2-num3;
		int bishop = 2-num4;
		int knight = 2-num5;
		int pawn = 8-num6;
		
		System.out.print(king+""+queen+""+rook+""+bishop+""+knight+""+pawn);
		
		sc.close();
	}
}
