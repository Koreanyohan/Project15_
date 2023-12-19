package main;

import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter을 사용하여 텍스트파일에
 * 숫자 1부터 10 중에서 짝수를 출력하세요.
 * Ex) 2 4 6 8 10
 *  
 * */
public class Quiz05 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("Quiz05.txt");

			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					String a = i+" "; // 숫자 + " " -> 문자열 됨
					fw.write(a);
					fw.flush(); 
//flush if문 밖에 써도 결과 같은데, 그게 맞음. flush의 목적이 buffer메모리에 있는 거 한번에 보내는게 목적이니까
//flush문 for문 밖에 써도 결과 같은 보니까, buffer메모리는 지역범위에도 저장된 것도 지역범위 벗어나도 그대로 유지 되는거 같다.
				}				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
