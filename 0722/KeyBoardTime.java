/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class KeyBoardTime{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int �ð�;
		int ��;
		int ��;
		


		System.out.println("�ð��� �� ������ �Է��Ͻÿ� "  );

		int input = scan.nextInt(); 

		�ð� = input / 3600;

		 �� = input % 3600 / 60;
		 
		 �� = input % 60;



		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.", input, �ð�, ��, ��);
	}
}