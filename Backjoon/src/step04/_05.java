package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김지홍
 * 내용 : OX퀴즈 8958
 */
public class _05 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 횟수 입력
		int count = 0;
		count = Integer.parseInt(br.readLine());
		
		// OX 입력
		String result;
		for(int i=0; i<count; i++) {
			result = br.readLine();
			String [] arr = result.split(""); // OX 잘라서 배열 넣기

			// O 찾기
			int score = 0;	
			for(int j=0; j<arr.length; j++) { // 입력한 배열길이 만큼 반복
				if(arr[j].equals("O")) { // O 와 같다면 1점 추가
					score++;
					int k = 1;
					// 배열 앞의 값과 같다면 1추가, 그전과 또 같다면 1추가
					while(j>=k && arr[j-k].equals("O")) {  
						score++;
						k++;
					}
				}
			}
			bw.write(score+"");
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
