package main;
// File클래스 - 자주쓴다!!!
import java.io.File;
import java.io.IOException;

public class Ex13_2 {

	public static void main(String[] args) {
		// File : 파일 정보를 담는 클래스
		// 파일의 경로, 크기 등이 정보를 확인 하거나 파일을 생성할 수 있음.
		
		File dir = new File("C:\\Users\\user\\Downloads"); // 디렉토리도 File클래스로 처리 가능하다.
				
		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for (File file : files) { // 폴더에 속한 파일들의 경로와 이름, 확장자 확인 가능.
			System.out.println(file.toString());
		}		
	}
}
