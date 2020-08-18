

public class LambdaDemo {
	public static void main(String[] args) {
		MyInterface mi =  (int a, int b) -> a * b; // Lambda expression

		int result = mi.calculate(34, 12);
		System.out.println("result = " + result);
	}
}
