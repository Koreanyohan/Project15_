package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		
		// input3.txt 파일 만들고 A-Z 작성하기
		

		try {
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input3.txt");
			
			// 배열 생성
			byte[] arr = new byte [10];
			
			// 읽어들인 요소의 갯수 저장
			int size;
			
			// 파일의 내용을 10바이트씩 읽어오기
			while(true) {
				// 파일의 내용을 읽어서 배열에 저장하고 (read(arr)) / 읽은 바이트수 반환 (size에 저장)
				size = fis.read(arr);  // 배열의 크기 10이라, 10바이트만큼 배열에 저장하고, 읽어드린 배열의 요소갯수반환
				 
				// 파일의 끝에 도달하면 루프 종료
				if (size == -1) {
					break;
				}
				// 읽어들인 크기만큼 배열요소를 출력
				for (int i = 0; i<size; i++) {
					System.out.print((char)arr[i]);
				}
				
				System.out.println(": " + size + "바이트 읽음");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
