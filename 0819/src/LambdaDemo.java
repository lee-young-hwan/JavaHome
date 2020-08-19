/*
 * 1. Interface�� ������ Lambda�� ����
 */

public class LambdaDemo {
	public static void main(String[] args) {
		
		MyInterface mi = (s1, s2) -> System.out.println(s1 + ", " + s2);  // �������̽� ������ ���ٽ� ����( �������̽� ���� -> ���ٽ� )
			
		
		mi.myConcat("Hello", "World");
		
	}
}

interface MyInterface{
	void myConcat(String s1, String s2);
}
