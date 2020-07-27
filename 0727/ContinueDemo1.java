/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class ContinueDemo1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String system_password = "1234";

		System.out.print("Enter a password : ");

		String user_password = scan.nextLine();

		int i = 0;

		for (; i < 4 ; i++)
		{
			if (system_password.charAt(i) == user_password.charAt(i))
			
				continue;
			
			else
			
				break;
		}

		if(i == 4)
		
			System.out.println("Login Success");
		
		else
			
				System.out.println("Login Fail");
			
		
	}
}