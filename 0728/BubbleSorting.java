/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Arrays;

public class BubbleSorting{
	public static void main(String[] args) {

		//�������� 

		int [] array = {5,8,2,1,4,6,2,3,7,9};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 1 ;i++)
		{
			for (int j = 0 ;j < array.length - 1 ;j++) // 
			{
				if (array[j] < array[j+1]) // 0��° < 1��°�̸� �ڸ��� �ٲ۴�, �̰ɷ� ��������/���������� ������
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));

	}
}