package main;
// File클래스 - 자주쓴다!!!
import java.io.File;
import java.io.IOException;

public class Ex13_1 {

	public static void main(String[] args) {
		// File : 파일 정보를 담는 클래스
		// 파일의 경로, 크기 등이 정보를 확인 하거나 파일을 생성할 수 있음.
		
		// newFile.txt와 연결된 파일 클래스 생성
		
		File file = new File("C:\\Users\\user\\Downloads\\newFile.txt");//문자열내에서 \\가 실제\다. 아직 파일 생성은 안함!!
		
		// 실제 파일 생성
		try {
			file.createNewFile();  // 
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		// 파일 속성 보기
		System.out.println("1." + file.isFile());  //파일인지?
		System.out.println("2." +  file.isDirectory()); // 폴더인지?
		System.out.println("3." +  file.getName()); // 파일 이름
		System.out.println("4." +  file.getAbsolutePath()); // 파일경로 (절대경로)
		System.out.println("5." +  file.getPath()); // 파일 경로 (상대경로)
		System.out.println("6." +  file.canRead()); // 읽을 수 있는지
		System.out.println("7." +  file.canWrite()); // 쓸 수 있는지	
		
		// 파일 삭제
//		file.delete();
	}
}
