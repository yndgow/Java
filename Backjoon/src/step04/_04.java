package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		int score = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			if(score > max) max = score; // 최대값 비교
			
		}

		// 점수 올리기
		int upscore;
		for(int i=0; i<count; i++) {
			upscore = Integer.parseInt(arr[i]);
			//upscore / max) * 100;
		}
	}

}
