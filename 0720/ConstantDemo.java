/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ConstantDemo {
	 public static void main(String[] args) {
		//final double PI = 3.141592; //����
		//System.out.printf("pi�� ���� %f�Դϴ�.\n", PI);
		//pi = 3.2;

		/*int max;
		max = Integer.MAX_VALUE; //Integer = Ŭ��������
		System.out.println("���� ū ���� " + max);
		System.out.println("���� ū �� ���� ���� " + (max + 1));*/

		byte min;
		min = Byte.MIN_VALUE;
		System.out.printf("���� ���� ������ �� ���� ���� %d�Դϴ�.\n", (byte)(min-1));  //(min-1) <- int ���� byte������ ���δٴ� ��
		System.out.println("���� ���� ������ �� ���� ���� " + (byte)(min-1) + "�Դϴ�");//(byte)�� ����ȯ �����ڶ�� ��

	}
}