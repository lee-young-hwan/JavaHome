/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
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