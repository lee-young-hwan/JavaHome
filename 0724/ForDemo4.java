/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ForDemo4{                                               // �ε����� ������� �ʴ� ���� ���� for�� = �ӵ����
	public static void main(String[] args) {
		String [] fruits = {"���", "����", "����", "����", "������"}; 

		//for(int i = 0; i <=4; i++)
		//{
		//	System.out.println("fruits[" + i + "] = " + fruits[i]);
		//}

		for( String myvalue : fruits ) // (  : �迭 �Ǵ� �÷��� �ݺ�)
		{
			System.out.println(myvalue); // ó������ ������ ���� �� ��� 
		}

	}
}