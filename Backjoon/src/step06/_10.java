package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/22
 * 이름 : 김지홍
 * 내용 : 그룹단어 체커 1316
 */

public class _10 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int result = count; // 입력숫자에서 중복된만큼 뺀값 
		
		for (int k = 0; k < count; k++) {
			String input = br.readLine();
			boolean dc = true; // 중복값을 찾으면 for문을 멈추기 위한 변수
			
			for (int i = 0; i < input.length(); i++) {
				
				if(dc == false) break; // 탈출 2

				// 하나의 알파벳이 여러개라면 시작지점과 마지막지점을 찾아 중간에 다른 값이 포함되면 result를 감소시키고 for문을 중단 
				int start = input.indexOf(input.charAt(i)); // 시작
				int end = input.lastIndexOf(input.charAt(i)); // 마지막

				for (int j = start; j <= end; j++) {
					if (input.charAt(j) != input.charAt(i)) {
						result--; // 감소
						dc = false; // 중복 변수를 false
						break; // for문 탈출 1
					} else {
					}
				}
			}
		}
		System.out.println(result);

	}
}
