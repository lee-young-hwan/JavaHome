import java.util.Scanner;

public class Input {

	public Telephone input() {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("����(1 : ������, 2 : ��û��, 3 : ������) : ");
	int kind = scan.nextInt();
	
	System.out.print("��ȭ��ȣ : ");
	String tel = scan.next();
	
	System.out.print("�̸� : ");
	String name = scan.next();
	
	System.out.print("��ȭ�� : ");
	int quantity = scan.nextInt();
	
	Telephone phone = new Telephone(kind, tel, name, quantity);
	return phone;
	
	
	}
}
