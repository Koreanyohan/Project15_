package main;
// 외워라. static 함수 잘 만들어야 ..
//다운로드 폴더에 있는 파일의 목록을 읽어서
//* 텍스트 파일에 출력하세요.
//* (파일 이름만 작성)
//이전 예제(ㄴ)를 함수 형태로 변경하세요.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz09 {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\user\\JOO YOHAN 2023.10.16~";
		String path2 = "C:\\Users\\user\\JOO YOHAN 2023.10.16~\\workplace";

		try {
			FileWriter fwter = new FileWriter("quiz9.txt");
			printFileList(path1, fwter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void printFileList(String filepath, FileWriter fw) { // 메인함수에 정의된 참조변수를 연결받음. 함수 내부에서 이 참조변수로 바로 메서드 사용 하고 있지.
		File dir = new File(filepath);
		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록

		try {
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				String filename = file.getName();
				fw.write(filename);
				fw.write("\n");
			}
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
