
public class Product {
	String name;
	int quantity, sellmoney, buymoney, fee, profit;
	double rate;
	
	void calculate() {
		//1) 판매금액 = 수량 * 판매단가
		int sell = quantity * sellmoney;
		
		//2) 매입금액 = 수량 * 매입단가
		int buy = quantity * buymoney;
		
		//3) 이익금 = 판매금액 - (매입금액 + 운송료)
		profit = sell - (buy + fee);
		
		//4) 이익율 = 이익금 / 매입금액 * 100
		rate = (double)profit / buy * 100;
	}
	
	void print() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", name, quantity, sellmoney, buymoney, fee, profit, rate);
	}
	
}
