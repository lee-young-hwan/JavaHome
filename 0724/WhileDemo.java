/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class WhileDemo{
	public static void main(String[] args) {
		//1, 2, 3, 4, 5

		/*int i = 1; // 초기화 
		while (i <= 5) // 조건
		{
			System.out.print(i+ "   ");
			i++; // 증감치
		}*/



	/*	int i = 1; // 초기치                                        int i = 1; //초기치
		while (i <= 100) // 조건                                   while( i <= 100)
		{                                                       //{ i++ } : while문을 만들고 바로 괄호안에 증감치(i++) 먼저 미리 넣어둔다 
			if (i % 7 == 0)
				System.out.print(i + "   ");
				i++; // 증감치 ★(까먹지 않게 주의)★
			
		}*/


/*

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요(음수를 입력하시면 끝)");

		int max = 0, mynum;

		while((mynum = scan.nextInt()) >= 0)
		{
			

			if (mynum < 0)
				break;


			if ( max < mynum )
				max = mynum;
			
			System.out.println("max = " + max);
			
		}*/




	/*	int i = 1;		
		
		while(i<10)
		{
			
			int j = 2;

			while(j<10)
			{

				System.out.printf("%d x %d = %d\n", j, i, j * i);

				j++;
			}
			System.out.println();
			i++;

		} */


		int i = 1;
		int sum = 0;


		while(true)
		{

			if(sum > 1000000)
				break;

			sum += i;
			
			i++;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);


	}
}