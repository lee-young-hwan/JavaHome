/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Scanner;

public class LcmGcm{
	public static void main(String[] args) {
		String str1, str2;
		int gcm = 0, lcm = 0, num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		str1 = scan.nextLine();        // 글자 "32"

		System.out.print("두번째 정수 : ");
		str2 = scan.nextLine();        // 글자 "24"

		num1 = Integer.parseInt(str1); // 입력받은 숫자는 10진수로 본다
		num2 = Integer.parseInt(str2, 10); // 입력받은 숫자는 10진수로 본다

		/*
			A = aG, B = bG, G = B,    L = 4 * 3 * 8

			LCM = a * b * G
		*/

		for (int i = 2;i < num1 ;i++)
		{
			if (num1 % i == 0 && num2 % i == 0)
			{
				gcm = i;
			}
			lcm = num1 / gcm * num2 / gcm * gcm;
			System.out.printf("%d와 %d의 GCM은 %d, LCM은 %d입니다.\n", num1, num2, gcm, lcm);
		}
		
	}
}