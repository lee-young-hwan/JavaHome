/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class Prime{
	public static void main(String[] args){

		int [] array = new int[200];

		int count = 0; 

		for (int i = 2; i < 200 ;i++)
		{
			array[i] = i; // 0 0 2 3 4 5 6 7 8 ... 199
		}

		for (int i = 2;i < 200 ;i++)
		{
			if (array[i] != 0)
			{
				System.out.printf("%5d", i);  // 2, 3, 5, 7, 11 ... 
				count++;    // �ϳ��� �þ������ count ����
				if(count % 10 == 0)
				{
					System.out.println();
				}
			}

			for (int j = i;j < 200 ;j += i )
			{
				array[j] = 0;
			}
		}
		System.out.println("\n�Ҽ��� ���� : " + count + "��");

		
	}
}