/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/
import java.util.Scanner;
public class Account{
	public static void main(String[] args) {
		
		

		Scanner scan;

		String id;
		String password;
		String name;
		String email;

		scan = new Scanner(System.in);


		System.out.print("id : ");
		id = scan.nextLine();
        System.out.println("������ id�� " + id + "�̱���.");

		
		System.out.print("password : ");
		password = scan.nextLine();
        System.out.println("������ password�� " + password + "�̱���.");

		
		System.out.print("name : ");
		name = scan.nextLine();
		System.out.println("������ name�� " + name + "�̱���.");

		
		System.out.print("email : ");
		email = scan.nextLine();
		System.out.println("������ email�� " + email + "�̱���.");

	}
}