/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ForDemo{
	public static void main(String[] args) {

		int count = 0; // �ϳ��� ��������ϱ� 0���� ����
		int line = 1;

		for(int i = 65; i <= 90 ;i++ )
		{
			if(line % 2 == 0)  // line�� ¦�� ���̶��
			{
				System.out.printf("%-5c", (char)(i+32));   // �ҹ��ڷ� ���
			}

			else  // line�� Ȧ�� ���̶��
			{
				System.out.printf("%-5c", (char)i);        // �빮�ڷ� ���
			}

			

			count++;         // 1�� ����� ������ ī��Ʈ�� ������Ŵ


			if(count % 5 == 0) // 5������ ���� �ٲ�
			{
				System.out.println();
				line++;
			}

		}


	}
}