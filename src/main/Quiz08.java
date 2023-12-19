package main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 다운로드 폴더에 있는 파일의 목록을 읽어서
 * 텍스트 파일에 출력하세요.
 * (파일 이름만 작성)
 */
public class Quiz08 {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\user\\Downloads");

		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();

		for (File file : files) { // 폴더에 속한 파일들의 경로와 이름, 확장자 확인 가능.
			try {
				FileWriter fow = new FileWriter("Quiz08.txt");
				String a = file.getName();
				fow.write(a);
				fow.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
//ㅅㅂ 왜 안풀리냐. 파일 하나밖에 이름 생성안됨.
		}
	}
}
