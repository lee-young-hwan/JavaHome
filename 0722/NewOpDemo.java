/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class NewOpDemo{
	public static void main(String[] args) {
		Scanner scan = null; //����, ������������ ��������
		scan = new Scanner(System.in);
		scan = new Scanner(new File());

		String irum = null; // null = �ƹ��͵� ������ �ʴ� ��

		irum = new String("������"); // ��� �������� new�� �����
		System.out.printf("�̸� = %s\n", irum);
		
		irum = new String("������");
		System.out.printf("�̸� = %s\n", irum);

		irum = "��"; // new String("��");
		irum = irum + "����"; //irum + new String("����"); -> new String("��" + "����")�̶�� ��
		

	}
}