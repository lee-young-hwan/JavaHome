import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Main m = new Main();
	Product p = new Product();
	m.input(p);
	p.calculate();
	p.print();
}
	
	void input(Product p) { // ��� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǰ �̸� : "); p.name = scan.next();
		System.out.print("���� : "); p.quantity = scan.nextInt();
		System.out.print("�Ǹ� �ܰ� : "); p.sellmoney = scan.nextInt();
		System.out.print("���� �ܰ� : "); p.buymoney = scan.nextInt();
		System.out.print("��۷� : "); p.fee = scan.nextInt();
	}
	
	
}
