/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ArrayDemo6{
	public static void main(String[] args) {

		String str = "����� ������ ���ﵿ";
		char [] array = str.toCharArray();
		
		for (int i =0; i < array.length ;i++)
		{
			System.out.printf("%3c", array[i]);
		}

		array[0] = '��';  array[1] = '��'; array[2] = '��';
		System.out.println();

		str = new String(array); // ���� �ٲٷ��� new�� ����ؾ��Ѵ�

		
		for (int i =0; i < array.length ;i++)
		{
			System.out.printf("%c", array[i]);
		}


		

		
		
	}
} 