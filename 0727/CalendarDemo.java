/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Scanner;

public class CalendarDemo{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("�� ��: ");
		String yearStr = scan.next();   // "2020"
		int year = Integer.parseInt(yearStr); // "2020" -> 2020

		String monthStr = scan.next();  // "7"
		int month = Integer.parseInt(monthStr);

		//String dayStr = scan.next();    // "27"
		//int day = Integer.parseInt(dayStr);

		int day = 1;  // �޷��� �ſ� 1�� ����


		// ���� 1����� year - 1����� �� ����
		int total = 0;

		// ���� 1������ 6�������� ��

		for (int i = 1;i < year;i++)
		{       
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0 )) // ���ذ� �����̶��
				total += 366; 
			
			else 
				total += 365;
			
		}



		int [] array; // ����
		if (year % 400 == 0 || (year % 4 == 0 && year % 100!= 0))
		{
			//���ذ� �����̶��
			array = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		}
		else {
			//���ذ� ������ �ƴ϶��
			array = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		}

		for (int i = 0; i < month - 1 ;i++ )
		{
			total += array[i];  // 6�� 30�ϱ���
		}

		
		// �̹��� ���ϱ�
		total += day;
		//System.out.println("total = " + total);

        int space = total % 7;
		int maxDay = array[month-1];
		//System.out.println("���� = " + space + ", ���������� = " + maxDay);

		/*switch (total % 7)
		{
		case 0 : System.out.println("�Ͽ����Դϴ�."); break;
		case 1 : System.out.println("�������Դϴ�."); break;
		case 2 : System.out.println("ȭ�����Դϴ�."); break;
		case 3 : System.out.println("�������Դϴ�."); break;
		case 4 : System.out.println("������Դϴ�."); break;
		case 5 : System.out.println("�ݿ����Դϴ�."); break;
		default : System.out.println("������Դϴ�."); break;
		}*/
		
		System.out.println("             #### " + year + "�� " + month + "�� ####");
		System.out.println("��\t��\t��\t�\t��\t��\t��");
		System.out.println("---------------------------------------------------");
		// �޷� ù°�� ����ó��

		int count = 0;

		for (int i = 0; i < space ;i++)
		{
			System.out.print("��\t");
			count++;
		}

		// 1�Ϻ��� ������ ������
		for (int i = 1; i <= maxDay ;i++)
		{
			System.out.print(i + "\t");
			count++;
			if (count % 7 == 0)
			{
				System.out.println();
				count = 0;
			}
		}

		if (count !=0)
		{
		
		// ������ �� ó��
		for (int i =0 ;i < (7 - count) ;i++ )
		{
			System.out.print("��\t");
		}
	  }
	}
}