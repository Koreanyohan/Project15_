/*
 * Scanner를 사용하여 두자리 정수 (10~99)를 입력받으세요.
 * 십의 자리와 일의 자리의 합을 구하세요.
 * 
 * ex) 53 => 8
 *     10 => 1
 *     28 => 10
 * */
package main;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		System.out.println("두 자리 정수를 입력받으세요");
		Scanner scanner = new Scanner (System.in);
		int a = scanner.nextInt();
		
		if (10<=a&& a <100) {
			int one = a%10; // 일의 자리
			int ten = a/10; // 십의 자리
			
			System.out.println("십의 자리와 일의 자리의 합 : " + (one + ten));
		} else {
			System.out.println("두 자리 정수를 다시 입력하세요.");
		}

	}

}
