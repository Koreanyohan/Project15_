package main;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		// Scanner 객체 생성
		// 표준입력을 인자로 사용 (화면에서 입력을 받겠다는 뜻) - > 입력
		Scanner scanner = new Scanner(System.in);
		
		//문자열 입력 받기
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		
		// 숫자 입력받기
		System.out.println("나이 : ");
		int age = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		
		// 사용한 리소스 닫기 - 사용한 시스템 자원을 반납하고 입력 스트림을 닫음.
		scanner.close();		
	}
}
