/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Yeonsan{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 수 :");
		int a = scan.nextInt();

		System.out.print("연산기호를 입력하세요 :");
		int x = scan.nextInt();

		System.out.print("두번째 수 :");
		int b = scan.nextInt();

		switch (x)
		{
		case 1 : System.out.print("결과는 " + (a + b) + "입니다."); break;
		case 2 : System.out.print("결과는 " + (a - b) + "입니다."); break;
		case 3 : System.out.print("결과는 " + (a * b) + "입니다."); break;
		case 4 : System.out.print("결과는 " + (a / b) + "입니다."); break;
		case 5 : System.out.print("결과는 " + (a % b) + "입니다."); break;
		default : System.out.print("잘못된 연산자입니다.");break;
		}

	    


	}
}