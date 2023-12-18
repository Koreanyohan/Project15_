/*
 * Scanner를 사용하여 배열에 숫자 5개를 입력하세요.
 * 배열의 모든 요소의 합을 구하세요.
 * */

package main;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int [] a = new int [5];
		int sum = 0;
		
		for ( int i = 0; i<a.length ; i++) {
			System.out.println("숫자를 입력해주세요.");
			Scanner scanner = new Scanner (System.in); // 이거 for문 밖에 뺏어도 됨
			int number = scanner.nextInt();
			a[i] = number; // a[i] = scanner.nextInt(); 로 했어도 됨
			sum = sum + a[i]; // 해설에서는 이 부분만 따로 빼서 반복문 하나 더 만듬
		}
		
		System.out.println(sum);
	}
	
	

}
