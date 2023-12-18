package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream사용하기
 * */
public class Ex07 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");
			
			byte[] arr = {65,66,67};
			
			// 배열의 모든 데이터 출력
			fos.write(arr);
		} catch (FileNotFoundException e) { // 질문 - 그럼 발생할 일은 없겠네? 이클립스인터페이스에서만 파일 없으면 생성하는건가? -> write메서드 출력 안되면, 파일 생성안되서 FileNotFoundException생김. 이를테면 Quiz04번에서 조건잘못입력 해서 write메서드 소환 안되는 경우
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}

	}

}
