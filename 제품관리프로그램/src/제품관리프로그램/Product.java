
public class Product {
	String name;
	int quantity, sellmoney, buymoney, fee, profit;
	double rate;
	
	void calculate() {
		//1) �Ǹűݾ� = ���� * �ǸŴܰ�
		int sell = quantity * sellmoney;
		
		//2) ���Աݾ� = ���� * ���Դܰ�
		int buy = quantity * buymoney;
		
		//3) ���ͱ� = �Ǹűݾ� - (���Աݾ� + ��۷�)
		profit = sell - (buy + fee);
		
		//4) ������ = ���ͱ� / ���Աݾ� * 100
		rate = (double)profit / buy * 100;
	}
	
	void print() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n", name, quantity, sellmoney, buymoney, fee, profit, rate);
	}
	
}
