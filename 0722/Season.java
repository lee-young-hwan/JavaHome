/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class Season{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("�����ϴ� ����(spring/summer/fall/winter) :" );

		String ���� = scan.nextLine(); //summer�� �Է¹��� ����
		
		System.out.println("���� : " + ����);

		String ��;

		String �� = "�� : " + (����.equals("spring")) ? "������, ���޷�" :
			                        (����.equals("summer")) ? "���, ��ī�þ�" :
			                        (����.equals("fall")) ? "����, �ڽ���" : "����, ��ȭ";

		System.out.println("�� : " + flower);
			                        





		
	}
}