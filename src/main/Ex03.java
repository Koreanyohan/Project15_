/*
 *  InputStream 사용하기
 * */

package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		
		// 텍스트파일과 연결된 입력 스트림 생성
		try {
			FileInputStream fis = new FileInputStream("input.txt"); // checked exception  cf) try문안에서 선언된변수는 지역변수다. 따라서 재사용하고 싶으면 FileInputStream fis = null;을 try문 밖에 선언해놓으면 됨. cf)프로젝트 바로 밑에 있는 파일연결하면 상대경로 안적어도 됨. '/'안써도 된다는말
			int i = fis.read();// read메서드는 반환값이 int임. // checked exception
								//-> add catch clause to surrounding by로 예외 처리함
			System.out.println(i); // 텍스트 파일에 있는 ABC중에서 A의 아스키 코드 나옴. : 65
//			FileInputStream은 1byte단위로 데이터를 읽고쓰는 바이트단위 스트림(p.10)이므로, read()메서드 써도 한 글자식 읽고 씀.
			System.out.println((char)(i)); // 아스키코드값 문자로 형변환.
			System.out.println(fis.read()); // B의 아스키코드값 : 66
			System.out.println(fis.read()); // C의 아스키코드값 : 67
			System.out.println(fis.read()); // 더이상 읽을 값 없으면 -1 반환 
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
