package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/06 ~ 19
 * 이름 : 김지홍
 * 내용 : 단어 공부 1157
 */

public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase(); // 입력 문자 모두 대문자화
		int [] arr = new int [26]; // A~Z 까지 반복횟수를 담을 배열
		
		// 각 문자의 반복횟수 만큼 해당 배열값 증가
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			arr[c-65]++;
		}
		
		// 가장 많이 사용된 값 찾기
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}

		// max 중복 검사
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				count++;
			}
		}

		// count 에 따라 결과출력
		if(count > 1) {
			System.out.println("?");
		}else {
			for(int i=0; i<arr.length; i++) {
				if(max == arr[i]) {
					System.out.println((char)(i+65));
				}
			}
		}
		
		br.close();
	}
}
