/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class IfDemo4{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("이름 :");

		String name = scan.nextLine();


		System.out.print("키 :");

		double height = scan.nextDouble();


		System.out.print("몸무게 :");

		double weight = scan.nextDouble();


		double bmi = weight / ((height / 100)*(height / 100));


		String result; 
		
		if (bmi>=40)
		{
			result = "고도 비만";
		}

		else if (bmi>=35)
		{
			result = "중증도 비만";
		}

		else if (bmi>=30)
		{
			result = "경도 비만";
		}

		else if (bmi>=25)
		{
			result = "과체중";
		}

		else if (bmi>=18.5 && bmi<23)
		{
			result = "정상";
		}

		else
		{
			result = "저체중";
		}


		System.out.printf("%s님의 bmi지수는 %.2f이고 %s입니다.", name, bmi, result);

		
	}
}