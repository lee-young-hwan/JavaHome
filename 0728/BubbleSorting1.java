/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner; //�Է¹�����
import java.util.Arrays;  //��¹�����

public class BubbleSorting1{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int [] array = new int[1000];
		
		System.out.println("������ �Է��ϼ���. �� 0�� ����");

		int idx = 0;

		while (true)
		{
			int su = scan.nextInt();
			
			if (su == 0)
			
				break;
				
			
			array[idx++] = su;  // su = 0�� �ƴ϶��
		
			System.out.println("Before Sorting");

			for (int i = 0; i < idx ;i++)
			{
				System.out.printf("%d\n", array[i]);
			}


			// ��������

			for (int i = 0;i < idx - 1 ;i++)
			{
				for (int j = 0;j < idx - 1 ;j++)
				{
					if (array[j] > array[j+1])
					{
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}

			

			}

			System.out.println("After Sorting");

			for (int i = 0; i < idx ;i++)
			{
				System.out.printf("%d\n", array[i]);
			}


		}
		
	}
}