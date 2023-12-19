package main;
// Ex11의 바이트단위 스트림으로 파일 복사하는거와 비교하기. BufferedStream이용함 여기는
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_2 {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		

		try {
			// 입출력 스트림 생성 (기반 스트림)
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("a-copy2.txt");
		
			// 위에 선언한 기반스트림이용해서 버퍼링보조스트림(생성자 인자로 기반스트림 must) 생성
			BufferedInputStream bis = new BufferedInputStream(fis) ;
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			
		// 1. 복사를 시작하는 시간 저장
			start = System.currentTimeMillis();//현재 시간 측정. 밀리세컨드로 표현.			
		
			while (true) {
				int i = bis.read();// 보조스트림 BufferedInputStream으로 read 메서드 사용
				if(i == -1) {
					break;
				}
				bos.write(i); // 보조스트림 BufferedOutputStream으로 write 메서드 사용
			} // 버퍼링보조스트림 사용하면 8k자료를 한꺼번에 읽고 써서 개빠름 (거의 350배 빠르구만)
			
		// 2. 복사가 끝나는 시간
			end = System.currentTimeMillis();
			System.out.println("파일 복사하는 데" + (end-start) + "milliseconds 소요 되었습니다.");
			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
