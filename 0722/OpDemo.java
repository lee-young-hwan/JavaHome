/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class OpDemo{
	public static void main(String[] args) {
		int su = -128;
		int result = ~su; // ~�� �������϶� ���
		
		boolean flag = true;
		boolean answer = !flag;

		System.out.printf("su = %d, result = %s\n", su, Integer.toBinaryString(su));

		System.out.printf("result = %d, result = %s\n", result, Integer.toBinaryString(result));
	}
}