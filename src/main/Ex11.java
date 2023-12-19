package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		// 입출력 스트림 생성
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("a-copy.txt");
			//   ㄴ 출력스트림 -> 밑에 반복문 통해 카피받을 파일(a-copy) 새로 생성함 자동으로.
			
		// 1. 복사를 시작하는 시간 저장
			start = System.currentTimeMillis();//현재 시간 측정. 밀리세컨드로 표현.
			
		// 한문자씩 읽어서 복사하는 중
			while (true) {
				int i = fis.read();  // FileInputStream의 read메서드로 읽은값 i에 저장
				if(i == -1) {
					break;
				}
				fos.write(i); // i값 
			}
		// 2. 복사가 끝나는 시간
			end = System.currentTimeMillis();
			System.out.println("파일 복사하는 데" + (end-start) + "milliseconds 소요 되었습니다.");
			
			// 스트림 복사시에 read, write메서드로 한 바이트씩 이용해서 느림. 따라서 Buffered스트림 사용하면 8k씩 자료 한번에 이동가능해서 빠르다.
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
