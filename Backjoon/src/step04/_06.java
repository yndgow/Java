package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김지홍
 * 내용 : 평균은 넘겠지 4344
 */
public class _06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 횟수 입력
		int count = 0;
		count = Integer.parseInt(br.readLine());
		
		// 학생수와 점수 입력
		for(int i=0; i<count; i++) {
			String [] arr =	br.readLine().split(" ");
			int sum = 0;
			double avg = 0.0;
			int avgUp = 0;
			double result = 0.0;
		
			// 학생수
			int sNum = Integer.parseInt(arr[0]);
		
			// 점수 합 구하기
			for(int j=1; j<arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
			}
			
			// 평균 구하기
			avg = sum / (sNum + 0.0);
			
			// 평균보다 높은 학생수 구하기
			for(int k=1; k<arr.length; k++) {
				if(Integer.parseInt(arr[k]) > avg) avgUp++;
			}
			
			// 평균을 넘는 학생수 비율 구하기
			result = avgUp / (sNum+0.0) * 100 ;
			bw.write(String.format("%.3f", result) + "%");
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
