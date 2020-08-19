/*
 * 1. Interface형 변수에 Lambda식 대입
 */

public class LambdaDemo {
	public static void main(String[] args) {
		
		MyInterface mi = (s1, s2) -> System.out.println(s1 + ", " + s2);  // 인터페이스 변수에 람다식 대입( 인터페이스 변수 -> 람다식 )
			
		
		mi.myConcat("Hello", "World");
		
	}
}

interface MyInterface{
	void myConcat(String s1, String s2);
}
