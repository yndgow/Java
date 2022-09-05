package step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 문자열 반복 2675
 */

public class _04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 수 입력
		int count  = Integer.parseInt(br.readLine());
		
		for(int i=0; i<count; i++) { // 케이스 수만큼 반복
			st = new StringTokenizer(br.readLine(), " ");
			int rCount = Integer.parseInt(st.nextToken()); // 문자 반복횟수
			String rStr = st.nextToken(); // 반복할 문자열
			for(int j=0; j<rStr.length(); j++) { // 문자열 0번부터 
				for(int k=0; k<rCount; k++) { // rCount 만큼 반복
					bw.write(rStr.charAt(j));
				}
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
