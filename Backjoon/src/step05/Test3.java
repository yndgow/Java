package step05;
/*
 * 날짜 : 2022/09/01 ~ 05
 * 이름 : 김지홍
 * 내용 : 한수 1065
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 숫자입력
		int result = 0; // 결과값 저장
		
		// 입력된 숫자까지 반복문
		for(int i=1; i<=num; i++) {
			if(hansu(i)==true) {
				result++; // 한수라면 ++
			}
		}
		// result 출력
		System.out.println(result);
	}
	
	static boolean hansu(int num) {
		if(num<100) {
			return true; // 100미만 true;
		}else if(num >=100) {
			int num1 = num % 10; // 1의자리
			int num2 = (num / 10) % 10; //10의자리
			int num3 = num / 100; // 100의자리
			
			if(num3 - num2 == num2 - num1 ) { // 등차수열확인
				return true;
			}
		}
		return false;
	}
}
