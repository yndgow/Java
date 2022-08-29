package step04;
/*
 * 날짜 : 2022/08/29
 * 이름 : 김지홍
 * 내용 : 평균 1546
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 횟수 입력
		int count = Integer.parseInt(br.readLine());
		
		// 점수 입력
		String inputScore = br.readLine();
		StringTokenizer st = new StringTokenizer(inputScore, " ");
		
		// 평균구하기위한 배열 생성
		String[] arr = inputScore.split(" ");
		
		// 최대값 구하기
		int max = 0;
		int score = 0;
		while(st.hasMoreTokens()) {
			score = Integer.parseInt(st.nextToken());
			if(score > max) max = score; // 최대값 비교
			
		}

		// 올린 점수 총합구하기
		double upscore;
		double sum = 0;
		
		for(int i=0; i<count; i++) {
			upscore = Double.parseDouble(arr[i]);
			sum += (upscore / max) * 100;
		}
		// 평균 구하기
		double avgUpScore = sum / count;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(avgUpScore+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
