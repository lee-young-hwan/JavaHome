/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ForDemo{
	public static void main(String[] args) {

		//int sum = 0;

		long result = 1;

		for (int i = 1; i <= 100; i++){			
			//System.out.print(a + "   "); // for�� ������ ���� ��� �ؾ��� �۾�
			//sum = sum + a; // 1 + 2 + ... + 9 + 10
			if(i % 5 == 0)
				System.out.print(i + "   ");
				//count++; // count�� 3�̸� �ٹٲ޵�

			
		}
		//System.out.println("���� " + sum);
		//System.out.println("5�� ����� " + result);
	}
}