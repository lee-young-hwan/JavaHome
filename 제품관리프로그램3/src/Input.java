import java.util.Scanner;

public class Input {
	void input(Product [] array){ // 멤버 변수
		Scanner scan = new Scanner(System.in);
		for ( int i = 0; i < array.length; i++ ) {
		Product p = new Product();
			
		
		System.out.print("상품 이름 : "); //p.name = scan.next();
		p.setName(scan.next());
		
		System.out.print("수량 : ");    //p.quantity = scan.nextInt();
		int quantity = scan.nextInt(); p.setQuantity(quantity);
		
		System.out.print("판매 단가 : "); //p.sellmoney = scan.nextInt();
		int sellmoney = scan.nextInt(); p.setSellmoney(sellmoney);
		
		System.out.print("매입 단가 : "); //p.buymoney = scan.nextInt();
		int buymoney = scan.nextInt(); p.setBuymoney(buymoney);
		
		System.out.print("운송료 : ");   //p.fee = scan.nextInt();
		int fee = scan.nextInt(); p.setFee(fee);
		
		array[i] = p;
		}
	}
}
