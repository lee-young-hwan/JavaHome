/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class IfDemo2{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print ("���� �����ΰ���? :");

		String season = scan.nextLine();

		System.out.println("season : " + season);

		String flower;

		if (season.equals("spring")) 
		{
			System.out.printf("flower�� %s, %s\n", "������", "���޷�"); 
		}

		else if(season.equals("summer")) 
		{
			System.out.printf("flower�� %s, %s\n", "���", "��ī�þ�");
		}

		else if(season.equals("fall")) 
		{
			System.out.printf("flower�� %s, %s\n", "����", "�ڽ���");
		}

		else
		{
			System.out.printf("flower�� %s, %s\n", "����", "��ȭ");
		}

            
			                        
		

	}
}