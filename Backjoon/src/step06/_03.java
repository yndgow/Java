package step06;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 알파벳 찾기 10809
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03 {
	public static void main(String[] args) throws IOException {
		
		// 단어 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// 기본값이 -1 인 알파벳 길이 배열 선언
		int arr [] = new int [26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		// 비교하여 일치하면 해당 배열 주소에 단어주소 넣기
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<27; j++) {
				if(s.charAt(i) == 'a'+j && arr[j] == -1) {
					arr[j] = i;
				}
			}
		}

		// 배열 출력
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
