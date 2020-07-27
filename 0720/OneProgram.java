/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class OneProgram{
	public static void main(String[] args) {
		
	Scanner	scan = new Scanner(System.in);
		double boo;
		int r;
		int height;
		double pi = 3.14;
		System.out.print("반지름을 입력하세요 :");
r = scan.nextInt();


System.out.print("높이를 입력하세요 :");
height = scan.nextInt();

        boo = r * r * pi * height;
		
		System.out.printf("원기둥의 부피는 %.2f입니다.", boo);



	}
}