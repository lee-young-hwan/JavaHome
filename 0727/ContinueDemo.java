/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ContinueDemo{
	public static void main(String[] args) {
		int i = 1;         // �ʱⰪ
		do
		{
			if (i % 7 == 0)
			{
				System.out.printf("%-3d", i);
			}
			else continue; // 7�� ����� �ƴϸ� ������ ����ϱ� ex) 8 9 10 11 12 13 15 16..
			i++;           // ����ġ
		}
		while (i <= 100);  // ����
	}
}