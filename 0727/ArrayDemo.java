/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ArrayDemo{
	public static void main(String[] args) {
		
	// ù��° ���

	/*	// 1.����(������)
		int su; 
		int [] array; // �ּҺ���

		// 2.����
		array = new int[4];

		// 3.�Ҵ�
		su = 5;
		array[0] = 3; array[1] = 4; array[2] = 5; array[3] = 6;     // 3,4,5,6 �̶�� ����ü�� array�� ����Ű�� �ִ� (heap�� ����)*/

		

	// �ι�° ���

	/*	// 1.����
		int [] array;

		// 2.����&�Ҵ�
		array = new int[]{3,4,5,6};    // ���� : [] �ȿ� ������ ���� �ȉ�*/



	// ����° ���

		// 1.����, ���� & �Ҵ�
		int [] array = {3,4,5,6};  // ����� �Ҵ��� ���� �ٿ� �Է��ؾ��Ѵ�. ����� �Ҵ��� �ٸ����̸� ������ ������ ����  ���� ����,����,ũ�⿩�߸� �Ѵ�
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);

		array[0] = array[0] * 100; // write

		for (int i = 0;i < 4 ;i++)
		{
			System.out.println(array[i]); // read            
		}

	}
}