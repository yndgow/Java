package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김지홍
 * 내용 : 단어의 개수 1152
 */

public class _06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String [] strArr = s.split(" "); // split 으로 잘라서 배열에 넣기
		
		if(strArr.length == 0) { // 공백만 들어온 경우
			System.out.println(0);
		}else if(strArr[0] == "") { // 문자열 시작이 공백이라면 -1{
			System.out.println(strArr.length-1);
		}else {
			System.out.println(strArr.length);
		}
		br.close();
	}
}
