package step05;
/*
 * 날짜 : 2022/09/01
 * 이름 : 김지홍
 * 내용 : 한수 1065
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 숫자입력
		int result = 0; // 결과값 저장
		
		if(num>=100) result = 99;
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
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			
			
		}
		return false;
		
	}
}
