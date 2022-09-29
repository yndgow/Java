package ch15.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("./src/ch15/stream/inputstream/input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char)b);
				}
				System.out.println(": " + i + "바이트 읽음");
				
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	} 
}
