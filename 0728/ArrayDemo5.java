/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ArrayDemo5{
	public static void main(String[] args) {
		String [] array = new String[]{new String("������"), new String("����� ������ ���ﵿ"), new String("Oracle"), new String("970111-1234567")};

		for (int i = 0; i < array.length ;i++) 
		{
			System.out.printf("array[%d] = %s%n", i, array[i]); // �ּ�
		}


	}
}