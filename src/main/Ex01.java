package main;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

	    int i = 0; // 혹은 밑에 int i = System.in.read(); 해주고 밑에 출력문들 try문에 다 넣어버려
		try {
			 i = System.in.read();  // checked Exception 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(i); // a->97
		
		// 문자로 사용하려면 형 변환 필요. i에 아스키코드 저장되었기 때문에
		System.out.println((char) i);
	}

}
