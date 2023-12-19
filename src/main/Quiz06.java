package main;

import java.io.FileWriter;
import java.io.IOException;

// FileWriter을 사용하여 파일에 구구단을 출력하세요
public class Quiz06 {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("Quiz06.txt");
			
			for (int i = 2 ; i<=9 ; i++) {
				fw.write("<" + i + ">"+"단");
				fw.write('\n');		
				for (int j = 1; j<=9 ; j++) {
					fw.write(i+ "x" + j + "=" + i*j+"  ");//안에 +"\n"하면 매번 줄바꿈										
				}
				fw.write('\n');	
				fw.write('\n');				
			}
			
			fw.flush();			
			
		} catch (IOException e) { 
			e.printStackTrace();
		}		

	}
}
