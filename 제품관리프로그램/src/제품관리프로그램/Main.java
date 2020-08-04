import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Main m = new Main();
	Product p = new Product();
	m.input(p);
	p.calculate();
	p.print();
}
	
	void input(Product p) { // 멤버 변수
		Scanner scan = new Scanner(System.in);
		System.out.print("상품 이름 : "); p.name = scan.next();
		System.out.print("수량 : "); p.quantity = scan.nextInt();
		System.out.print("판매 단가 : "); p.sellmoney = scan.nextInt();
		System.out.print("매입 단가 : "); p.buymoney = scan.nextInt();
		System.out.print("운송료 : "); p.fee = scan.nextInt();
	}
	
	
}
