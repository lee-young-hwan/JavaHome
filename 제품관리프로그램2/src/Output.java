
public class Output {
	void print(Product [] array) {
		for (Product p : array)
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f%n", p.getName(), p.getQuantity(), p.getSellmoney(), p.getBuymoney(), p.getFee(), p.getProfit(), p.getRate());
	}
}
