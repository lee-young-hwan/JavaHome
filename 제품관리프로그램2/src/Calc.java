

public class Calc {
	void calculate(Product [] array) {
		for (int i = 0; i < array.length; i++) {
			//1) 판매금액 = 수량 * 판매단가
			int sell = array[i].getQuantity()* array[i].getSellmoney();

			//2) 매입금액 = 수량 * 매입단가
			int buy = array[i].getQuantity() * array[i].getBuymoney();

			//3) 이익금 =판매금액 - (매입금액 + 운송료)
			array[i].setProfit(sell - (buy + array[i].getFee()));

			//4) 이익율 = 이익금 / 매입금액 * 100
			array[i].setRate((double)array[i].getProfit() / buy * 100);	
		}
	}
}
