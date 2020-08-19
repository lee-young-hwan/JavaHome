/*
 * 2. �Ű������� Lambda�� ���
 */

public class LambdaDemo1 {
	public static void main(String[] args) {
		//PrintString lambdaStr = s -> System.out.println(s);
		//lambdaStr.showString("Hello");
		myMethod(s -> System.out.println(s));
		//myMethod(lambdaStr);
		
		//returnString().showString("Hello");
		PrintString ps = returnString();
		ps.showString("Hello"); //
		
	}
	static void myMethod(PrintString lambdaStr) {
	lambdaStr.showString("World");
	}
	
	//3. Return Type���� Lambda�� ��� 
	static PrintString returnString() {
		return s -> System.out.println(s + ", from Lambda Expression");
	}
	
}

@FunctionalInterface
interface PrintString{
	void showString(String s);
}
