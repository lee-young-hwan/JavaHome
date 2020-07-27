/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class IfDemo2{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print ("무슨 계절인가요? :");

		String season = scan.nextLine();

		System.out.println("season : " + season);

		String flower;

		if (season.equals("spring")) 
		{
			System.out.printf("flower은 %s, %s\n", "개나리", "진달래"); 
		}

		else if(season.equals("summer")) 
		{
			System.out.printf("flower은 %s, %s\n", "장미", "아카시아");
		}

		else if(season.equals("fall")) 
		{
			System.out.printf("flower은 %s, %s\n", "백합", "코스모스");
		}

		else
		{
			System.out.printf("flower은 %s, %s\n", "동백", "매화");
		}

            
			                        
		

	}
}