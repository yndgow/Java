package sub01;

import java.util.Scanner;

public class Test04 {
/*
 * 날짜 : 2022/08/19
 * 이름 : 김지홍
 * 내용 : 자바 연산자 연습문제
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("등급은 %c입니다.", grade);
		sc.close();
	}
}
