package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김지홍
 * 내용 : 나머지 3052
 * 주소 : https://www.acmicpc.net/problem/3052
 * 
 * HashSEt
 *  - Java Collection 중 Set 의 파생 클래스 / set은 집합이라고 생각
 *  - 중복 원소를 허용x
 *  - 순서 x, 정렬시 리스트로 변환 후 정렬
 */


public class _0301 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = 0;
		int [] arr = new int[10];
		
		// Hashset 선언
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// add 로 42로 나눈 나머지 숫자 HashSet에 넣기
		for(int i=0; i<arr.length; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		// 중복원소를 허용하지 않으므로 HashSet의 사이즈가 곧 서로다른개수
		size = hs.size();
		
		bw.write(size + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
