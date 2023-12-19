package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream을 사용하여 텍스트파일에 문자 A-Z까지 출력하세요.
 * */
public class Quiz04 {

	public static void main(String[] args) {
		
		// void write(byte값)으로 풀기
		try {
			FileOutputStream fo = new FileOutputStream("output3.txt");
			System.out.println((byte)'A');
			System.out.println((byte)'Z');
			
			byte a = (byte)'A';
			byte b = (byte)'Z';
			
			for (byte i = a; i<=b ; i++) {
				fo.write(i);  
			}			
			
//			해설풀이
//			for (int i = 0; i < 26; i++) {
//				fos.write(data); // A-Z 출력
//				data++;
//			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// void write(byte[] b)  이용해서 풀이.
		byte [] arr = new byte[26];
		byte data2 = 65;
		
		try {
			FileOutputStream fo2 = new FileOutputStream("output3-1.txt");
						
			for (int i = 0; i < 26; i++) {
				fo2.write(data2); // A-Z 출력
				data2++;
			}
			
			fo2.write(arr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
