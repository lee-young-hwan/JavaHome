/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

/*
	�迭�� �ʱ�ȭ
	1. ���� -> byte, short, int, log : 0���� �ʱ�ȭ
	2. �Ǽ� -> float, double : 0.0���� �ʱ�ȭ
	3. Boolean -> false�� �ʱ�ȭ
	4. ���� -> char : �ΰ�, '\0', '\u0000' 
	5. ������ -> �ּ� : �ι���, null
*/

public class ArrayDemo1{
	public static void main(String[] args) {
		String [] array = new String[4];

		for (int i = 0;i < 4 ;i++)
		{
			System.out.printf("array[%d] = %s\n", i, array[i]);
		}
	}
}