import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ͻ÷���, q�� �Է��ϼ���");
		
		String str = null;
		
		// do-while���� �ݵ�� �ѹ��� �����Ѵ�
		do {
			
			System.out.print(">");
			str = scan.nextLine();
			
			System.out.println("�Է¹��� �޼��� :" + str);
			
		} while(str.equals("q"));
		
		System.out.println("���α׷� ����");
		scan.close();
		
	}
}
