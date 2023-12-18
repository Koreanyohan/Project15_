package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		
		try {
			//텍스트 파일과 연결된 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input1.txt");
					//ㄴ cf) input2.txt 파일에 연결하면, 나와야할 "안녕하세요" 깨짐. InputStream인터페이스는 1바이트 단위로 읽고씀! 따라서 한글은 2바이트라 안됨
			// 파일의 내용을 읽다가 파일의 끝에 도달하면 반복문 종료.
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
			
			// 파일의 끝에 도달하면 -1을 반환
			if(i == -1) { 
				break;  // 파일 끝 도달하면 반복문 종료시키기
			}			
			
			//문자로 변환하여 출력
			System.out.println((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}