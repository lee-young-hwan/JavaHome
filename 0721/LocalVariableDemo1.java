/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class LocalVariableDemo1{
	public static void main(String[] args) {

		double height; // ��������
		Scanner scan;  // �������� , ����
		scan = new Scanner(System.in);  // ����
		
		System.out.print("������ Ű�� ?");
		height = scan.nextDouble();

		double inchi = height / 2.54;   // inchi�� ��������
		double pit = inchi / 12;       // ��������

		System.out.printf("%.2fcm�� %.2f��Ʈ, %.2f��ġ �Դϴ�.\n", height, pit, inchi);  


	}
}