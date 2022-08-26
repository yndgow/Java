package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김지홍
 * 내용 : 나머지 3052
 * 주소 : https://www.acmicpc.net/problem/3052
 * 
 * boolean true false 를 이용하여 중복 값을 처리
 * 나머지 숫자 범위 만큼의 배열을 생성하여 특정값(true)를 넣은뒤 갯수세기 
 */


public class _0302 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		// 나머지의 범위가 0~41 이므로 길이가 42인 배열 생성
		boolean [] arr = new boolean[42];
		
		// 배열의 주소값 = 나머지 에 true 넣기
		// 중복인 나머지도 true로 덧씌어지므로 갯수의 변화가 없음
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		// 배열을 모두 확인하여 true인 값만 count의 숫자를 증가시킴
		for(boolean val : arr) {
			if(val) count++;
		}
		
		bw.write(count + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
