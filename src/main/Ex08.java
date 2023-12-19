package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// 한글을 입력 못받는 InputStream(바이트 단위 스트림)
		FileInputStream fis;
		try {
			fis = new FileInputStream("Ex08.txt");

			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
									// 아스키코드 말고 utf체계에 무슨 걸로 가져와서 i에 저장
									// 아스키코드 내에 있는 값들은 아스키코드 값으로 i에 저장됨
				if (i == -1) {
					break;
				}

				System.out.print((char) i);    // ìëíì¸ì
				// ㄴ 한글은 1byte로 표현할 수 없어서 모두 깨짐
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 문자기반 스트림 Reader 中 FileReader 사용하여 문자열 입력받기
		try {
			FileReader fr = new FileReader("Ex08.txt");

			while (true) {
				int i = fr.read(); // 한 문자(2바이트)씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글이 제대로 읽힘  // 안녕하세요
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 문자 기반 스트림은 한글도 읽을 수 있다 */
}
