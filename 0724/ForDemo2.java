/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class ForDemo2{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �� ?: "); // �� ���� ����� ������ ��¹� ����

		int dan = scan.nextInt(); // ����ڰ� ��¹��� �� �������� �Է�

		for(int i = 1; i < 10; i++)
		{
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);  // dan = ����ڰ� �Է��� ���ڴϱ� ���������̱� ������ i�� �ݺ���Ų��
		}

	}
}