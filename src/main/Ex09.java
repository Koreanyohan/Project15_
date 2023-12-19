package main;

import java.io.FileWriter;
import java.io.IOException;
// 12월 19일 시작
public class Ex09 {

	public static void main(String[] args) {

		// 문자 기반 출력 스트림 생성
		try {
			FileWriter fw = new FileWriter("Ex09.txt");
			// FileOutputStream 처럼, 파일 없으면 자동 생성함. 프로젝트 F5만 눌러주면됨.
			
		// 문자 하나  출력			
			fw.write('A'); // (int)'A'로 매개변수 자동 형변환
			
		// 숫자 출력
			fw.write('6'); // 문자열 사용
			fw.write(54);  // 아스키코드 사용
			
		// 문자열 출력
			fw.write("안녕하세요");
			
		// 특수 기호 출력
			fw.write('\n'); // 줄바꿈   cf) \t : 들여쓰기
			
		// 배열 출력
			char[] arr = {'a', 'b', 'c'};
			fw.write(arr);
			
	// FileWriter는 버퍼를 사용하여, 데이터를 모았다가 한번에 출력함
	// 버퍼 : 데이터를 임시로 저장하는 공간
			fw.flush();  // 해줘야 버퍼에 쌓인 데이터 한번에 출력
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
