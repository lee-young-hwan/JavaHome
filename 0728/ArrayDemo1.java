/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ArrayDemo1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int [] monthMaxDayes = new int [6];  // 방이 12개

		String [] monthNames = new String [6];

		monthMaxDayes[0] = 31;      // 변수생성
		monthNames[0] = "January";  // 변수생성

        monthMaxDayes[1] = 29;      
		monthNames[1] = "February";

		monthMaxDayes[2] = 31;      
		monthNames[2] = "March";

		monthMaxDayes[3] = 30;      
		monthNames[3] = "April";

		monthMaxDayes[4] = 31;      
		monthNames[4] = "May";

		monthMaxDayes[5] = 30;      
		monthNames[5] = "June";

		System.out.print("몇 월? :");
		int month = scan.nextInt();

	
		System.out.printf("%d월은 %s이며 마지막 날은 %d일 입니다.", month, monthNames[month-1], monthMaxDayes[month-1]);





		
		


	}
}