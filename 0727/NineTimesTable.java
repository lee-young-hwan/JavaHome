/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class NineTimesTable{
	public static void main(String[] args) {

		
		int i = 1;  // �ʱ�ȭ

		do
		{
			int j = 2;
			do
			{
				System.out.printf("%d x %d = %d  ", j, i , j * i);
				j++;  // ����ġ
			}
			while (j < 10); // ����
			System.out.println();
			
			i++; // ����ġ
		}
		while (i < 10); // ����
		
	}
}


