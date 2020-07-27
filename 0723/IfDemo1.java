/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class IfDemo1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print ("정수가 짝수인가요 홀수인가요? :");

		int number = scan.nextInt();

		if(number % 2 == 0){
			System.out.println("짝수입니다.");
		}

		else {
			System.out.println("홀수입니다.");
		}
		
	}
}