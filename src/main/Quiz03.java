/*
 * 무한 루프를 사용하여 문자열을 계속 입력 받습니다.
 * 문자열을 입력받다가 "STOP"이 입력되면 루프를 종료하세요.
 * 단, "Stop"의 대소문자는 구분하지 않습니다.
 * 
 * 11장 quiz07과 비슷함.
 * */

package main;

import java.util.Scanner;
/*
 * 무한 루프를 사용하여 문자열을 계속 입력 받습니다.
 * 문자열을 입력받다가 "STOP"이 입력되면 루프를 종료하세요.
 * 단, "Stop"의 대소문자는 구분하지 않습니다.
 * 
 * 11장 quiz07과 비슷함.
 * */
public class Quiz03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean k = true;

		while (k) {
			System.out.println("문자열을 입력하세요.");
			String a = scanner.nextLine();
			String b = a.toUpperCase();
			if (a.equalsIgnoreCase("STOP")) // a.toUpperCase().equals("STOP") 
											// a.toLowerCase().equals("stop") 해도 됨.
				// ㄴ 이거 if(a.toUpperCase() == "STOP")했다가 안풀림. a.toUpperCase()가 String의 객체라 그런가.    잘몰겄다. 걍 닥치고 String 비교는 equals쓰자.
				k = false; // 해설에는 k 대신 true넣고 여기에 break;씀.
		}
	}
}
