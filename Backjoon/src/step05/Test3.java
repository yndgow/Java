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
		if(num<100) return true; // 100미만 true;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int j = 0; j<4; j++) {
			arr.add(num % 10);
			num /= 10;
			if(num == 0) break;
		}
		if (arr.get(0) <= arr.get(1)) {
			return true;
		} else {
			return false;
		}
	}
}
