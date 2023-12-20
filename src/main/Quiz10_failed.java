package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 재귀함수
public class Quiz10_failed {

	public static void main(String[] args) {
		String path1 = "C:\\Users\\user\\JOO YOHAN 2023.10.16~\\@@ git";
		

		try {
			FileWriter fwter = new FileWriter("quiz10.txt");
			printFileList(path1, fwter, 0);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void printFileList(String filepath, FileWriter fw, int level) { // 메인함수에 정의된 참조변수를 연결받음. 함수 내부에서 이 참조변수로 바로 메서드 사용 하고
																// 있지.
		File dir = new File(filepath);
		File[] files = dir.listFiles(); // 폴더 밑에 있는 파일 목록

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String filename = file.getName();		

			
			try {
				
				fw.write("\n");
				
				StringBuilder builder = new StringBuilder();

				// 들여쓰기로 계층구조 표시
				for (int j = 0; j < level; j++) {
					builder.append("\t");
				}

				builder.append(filename);

				// 파일 이름 출력
				fw.write(builder.toString());
				
				if (file.isDirectory()) {					
					String path = file.getAbsolutePath(); // 답안은 getPath메서드 씀.
					printFileList(path, fw, ++level);				
// 메인함수에서 호출한 자바와 txt파일 연결한 매개변수 fwter계속 유지해야 되니까,
//					재귀함수의 매개변수를 최초 함수의 매개변수와 같게 했어야 
					
//					FileWriter fwter = new FileWriter("quiz10.txt");
//					String path = file.getAbsolutePath();
//					printFileList(path, fwter);
					// 이렇게 했다가 망함. 새로 Quiz10.txt랑 자바파일을 연결해서 초기화 되버림. 
				}
				fw.write("\n");
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
