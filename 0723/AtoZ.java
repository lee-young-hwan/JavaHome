/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/



public class AtoZ{
	public static void main(String[] args) {

 	char Dae = 'A';                     // Dae ��� ���ڸ� 'A'��� ����
		
		
		

		int count = 1;

	for (int i = 1; i <= 26 ;i++)
	{

		System.out.print(Dae + "   ");

		Dae+=1;                             // Dae�� 1���� 26���� �빮�ڷ� ���
		
		


		if(count % 5 ==0)                   // ���ٿ� 5���� ���
				System.out.println();

		count++;                            // 1�� ����� ������ ī��Ʈ�� ������Ŵ
	} 

		




		
	}
}