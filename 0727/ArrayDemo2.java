/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class ArrayDemo2{
	public static void main(String[] args) {   // args : arguments

		System.out.println("�迭�� ���� : " + args.length);

		Scanner scan = new Scanner(System.in);

		float [] array = new float[3];

		for (int i = 0; i < array.length ;i++)   // �迭�� ���� = �迭�� ����, �迭�� �̸�.length 
		{
			System.out.print(">> : ");
			array[i] = scan.nextFloat();
		}

		float min = array[0], max = array[0]; // ���� (�׻� 0��° ���� �������� ���Ѵ�)

		for (int i =0;i < array.length ;i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}

			if (max < array[i])
			{
				max = array[i];
			}
		}
		System.out.println("���� ū �� = " + max);
		System.out.println("���� ������ = " + min);
		
	}
} 