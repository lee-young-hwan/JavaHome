

public class RecursiveCallDemo {
	public static void main(String[] args) {
		factorial(5);  // 5 x 4 x 3 x 2 x 1
		//print(1);
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(fibonacci(i) + "\t");
//		}
	}
	static int factorial(int su) {
		if (su == 1) return 1;
		else return su + factorial(--su);
	}
	
//	static int fibonacci(int n) {
//		if( n <= 2 ) return 1;
//		else return fibonacci(n-1) + fibonacci(n-2);
//	}
//	static void print(int su) {
//		System.out.print(su + "\t");
//		if (su == 5) return;
//		else print(++su);
	
}

