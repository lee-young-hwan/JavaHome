import java.util.Scanner;

public class Input {
	void input(Product [] array){ // ��� ����
		Scanner scan = new Scanner(System.in);
		for ( int i = 0; i < array.length; i++ ) {
			Product p = new Product();

			System.out.print("��ǰ �̸� : "); 
			p.setName(scan.next());
			
			System.out.print("���� : ");    
			p.setQuantity(scan.nextInt());
			
			System.out.print("�Ǹ� �ܰ� : "); 
			p.setSellmoney(scan.nextInt()); 
			
			System.out.print("���� �ܰ� : "); 
			p.setBuymoney(scan.nextInt());
			
			System.out.print("��۷� : ");   
			p.setFee(scan.nextInt());
			
			array[i] = p;
		}
	}
}
