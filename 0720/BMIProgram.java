/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class BMIProgram{
	public static void main(String[] args) {
		
	Scanner	scan = new Scanner(System.in);
	double ki;
	double weight;
	double BMI;

	System.out.print("Ű�� �Է��ϼ��� :");
    ki = scan.nextDouble();


    System.out.print("�����Ը� �Է��ϼ��� :");
    weight = scan.nextDouble();

    BMI = weight / (ki / 100 * 2);
		
	System.out.printf("������ BMI������ %.2f�Դϴ�.", BMI);



	}
}