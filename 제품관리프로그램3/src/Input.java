import java.util.Scanner;

public class Input {
	void input(Product [] array){ // ��� ����
		Scanner scan = new Scanner(System.in);
		for ( int i = 0; i < array.length; i++ ) {
		Product p = new Product();
			
		
		System.out.print("��ǰ �̸� : "); //p.name = scan.next();
		p.setName(scan.next());
		
		System.out.print("���� : ");    //p.quantity = scan.nextInt();
		int quantity = scan.nextInt(); p.setQuantity(quantity);
		
		System.out.print("�Ǹ� �ܰ� : "); //p.sellmoney = scan.nextInt();
		int sellmoney = scan.nextInt(); p.setSellmoney(sellmoney);
		
		System.out.print("���� �ܰ� : "); //p.buymoney = scan.nextInt();
		int buymoney = scan.nextInt(); p.setBuymoney(buymoney);
		
		System.out.print("��۷� : ");   //p.fee = scan.nextInt();
		int fee = scan.nextInt(); p.setFee(fee);
		
		array[i] = p;
		}
	}
}
