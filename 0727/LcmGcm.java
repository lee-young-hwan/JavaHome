/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class LcmGcm{
	public static void main(String[] args) {
		String str1, str2;
		int gcm = 0, lcm = 0, num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		str1 = scan.nextLine();        // ���� "32"

		System.out.print("�ι�° ���� : ");
		str2 = scan.nextLine();        // ���� "24"

		num1 = Integer.parseInt(str1); // �Է¹��� ���ڴ� 10������ ����
		num2 = Integer.parseInt(str2, 10); // �Է¹��� ���ڴ� 10������ ����

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
			System.out.printf("%d�� %d�� GCM�� %d, LCM�� %d�Դϴ�.\n", num1, num2, gcm, lcm);
		}
		
	}
}