/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class Seven3jul{
	public static void main(String[] args) {

		
		int count = 1;

		for (int i=1 ;i <= 100 ;i++)
		{
			if (i % 7 ==0)                       // 7�� ����� ���
			{
				System.out.print(i + "   ");

				 
			if(count % 3 ==0)                    // 1�ٿ� 3���� ���
				System.out.println();

			}

			count++;                             // 1�� ����� ������ ī��Ʈ�� ������Ŵ
		} 
	}
}