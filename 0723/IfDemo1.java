/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class IfDemo1{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print ("������ ¦���ΰ��� Ȧ���ΰ���? :");

		int number = scan.nextInt();

		if(number % 2 == 0){
			System.out.println("¦���Դϴ�.");
		}

		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}
}