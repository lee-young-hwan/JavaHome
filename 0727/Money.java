/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class Money{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String y_n = null;
	do{
		System.out.print("Money : ");

		int money = scan.nextInt();


		for (int i = 0;i < array.length; i++)
		{
			System.out.println(array[i] + " 원권 : " + money / array[i]);
			money = money % array[i];
		}
		
		System.out.print("Again(y / n)? : ");
		y_n = scan.nextLine();
	} while (y_n.equals("y"));
	{
	}




		



	}
} 