package step02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 날짜 : 2022/08/20
 * 이름 : 김지홍
 * 내용 : 사분면 고르기 14681
 */
public class _04{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.valueOf(br.readLine());
		int y = Integer.valueOf(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String result;
		if(x>0) {
			result = y > 0 ? "1" : "4";
		}else {
			result = y > 0 ? "2" : "3";
		}
		
		bw.write(result);
		bw.flush();
		bw.close();
	}
}