/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;
public class cmProgram{
	public static void main(String[] args) {

		
		Scanner scan  = new Scanner(System.in);

		int k;
		double pit;
		double inchi;


		System.out.print("Ű :");
		k = scan.nextInt();


		inchi = k / 2.54;
		pit = inchi / 12;
		
		


		System.out.printf("pit= %.2f\n", pit);
		System.out.printf("inchi= %.2f\n", inchi);

		



	}
}