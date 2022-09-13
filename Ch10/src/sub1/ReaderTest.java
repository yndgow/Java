package sub1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13
 * 이름 : 김지홍
 * 내용 : FileReader 실습하기
 *  - 외국어도 가능
 */

public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		
		try {
			FileReader fr = new FileReader(path);

			while(true) {
				int value =fr.read();
				
				if(value == -1) {
					// 파일을 모두 읽었으면 
					break;
				}
				
				char c = (char)value;
				System.out.print(c);
			}
			
			// 스트림 해제
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
