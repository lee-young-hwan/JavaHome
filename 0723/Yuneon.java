/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Yuneon{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print ("올해는 윤년인가요? :");

		int Yuneon = scan.nextInt();

		if ((Yuneon % 4 == 0 && Yuneon % 100 != 0) || Yuneon % 400 == 0)
		{
			System.out.println("올해는 윤년입니다.");
		}
		else
		{
			System.out.println("올해는 윤년이 아닙니다.");
		}
	}
}