/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Arrays;

public class ArrayDemo2{
	public static void main(String[] args) {
		int [] array = {10, 20, 30, 40, 50};

	/* ù��° ��� (�ε����� �ʿ��Ҷ�)
		for (int i = 0;i < array.length ;i++)
		{
			System.out.printf("%5d", array[i]);
		}*/


	/*  �ι�° ���
		for (int su : array)
		{
			System.out.printf("%5d", su);
		}*/

		System.out.println(Arrays.toString(array)); 



	}
}