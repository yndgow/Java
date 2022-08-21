package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _03 {

	public static void main(String[] args) throws IOException {
		int cData;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		cData = Integer.valueOf(br.readLine());
		
		for(int i=1; i<=cData; i++) {
			sum += i;
		}
		bw.write(sum + "");
		br.close();
		bw.flush();
		bw.close();
	}
}
