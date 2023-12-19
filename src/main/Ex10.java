package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) {
		
//		사실 여기서 보조스트림 대신, Reader스트림 클래스 써도 되서 활용도가 높지는 않음.	
		try {			
			// 기반 스트림 생성 (보조 스트림의 매개변수로 들어갈 예정)
			FileInputStream fis = new FileInputStream("Ex10.txt");
			
			// 보조 스트림 생성(생성자의 매개변수에 '반드시' 기반스트림있어야) : 읽어오는 byte -> 문자
			InputStreamReader isr = new InputStreamReader(fis);
			
			// 보조스트림으로 파일 내용 읽기
			while(true) {
//				int i = fis.read(); // ìëíì¸ì
				int i = isr.read(); // 바이트 읽은 내용을 문자로 변환하여 가져옴
				if(i==-1) {
					break;
				}
				System.out.print((char)i);//InputStreamReader 덕에 한글이 제대로 출력
			}
			
		} catch (FileNotFoundException e) { //IOException의 자손 예외라 삭제 해도 됨
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	
	}
}
