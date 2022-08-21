package step02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 날짜 : 2022/08/20
 * 이름 : 김지홍
 * 내용 : 주사위 세개 2480
 */
public class _07{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String aDice = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(aDice, " ");
		int dice1 = Integer.valueOf(st.nextToken());
		int dice2 = Integer.valueOf(st.nextToken());
		int dice3 = Integer.valueOf(st.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result;
		if(dice1 == dice2 && dice1 == dice3 && dice2 == dice3) { // 모두 같은 경우
			result = 10000 + (dice1 * 1000);
		}else if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3) { // 모두 다른 경우
			if(dice1 >= dice2 && dice1 >= dice3) {
				result = dice1 * 100;
			}else if(dice2 >= dice1 && dice2 >= dice3) {
				result = dice2 * 100;
			}else {
				result = dice3 * 100;
			}
		}else { // 2개만 같은 경우
			if(dice1 == dice2 || dice1 == dice3) {
				result = 1000 + dice1 * 100;
			}else {
				result = 1000 + dice2 * 100;
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}