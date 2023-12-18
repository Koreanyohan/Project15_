

package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * FileOutputStream 사용하기
 * */
public class Ex06 {

	public static void main(String[] args) {
		
		try {
			//파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("output.txt");
	// cf) InputStream과 다르게 OutputStream은 파일 없으면 지가 만들어버림. 다만 동기화안해줌. -> 클래스가 속한 프로젝트 폴더 눌러서 F5누르면 나옴. 결론적으로 txt파일 안만들어도 됀다.
			
			byte a = 65; // 65 -> A 문자로 변환되어 저장됨.
			byte b = 66;
			
			fos.write(a); // 1바이트씩 파일에 저장
			fos.write(b);
			fos.write('C'); // 그대로 저장됨. 'C' 치면 자동으로 형변환해줌. (int)'C'			
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
