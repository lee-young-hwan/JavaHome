

public class Calc {
	void calculate(Product [] array) {
		for (int i = 0; i < array.length; i++) {
			//1) �Ǹűݾ� = ���� * �ǸŴܰ�
			int sell = array[i].getQuantity()* array[i].getSellmoney();

			//2) ���Աݾ� = ���� * ���Դܰ�
			int buy = array[i].getQuantity() * array[i].getBuymoney();

			//3) ���ͱ� =�Ǹűݾ� - (���Աݾ� + ��۷�)
			array[i].setProfit(sell - (buy + array[i].getFee()));

			//4) ������ = ���ͱ� / ���Աݾ� * 100
			array[i].setRate((double)array[i].getProfit() / buy * 100);	
		}
	}
}
