/*
 *  1. static은 멤버로 접근이 안됨
 *  2. 멤버는 static으로 접근 가능
 */

public class StaticDemo2 {
	public static void main(String[] args) {
		// Outer.a a가 스태틱 변수이기 때문에 Outer의 주소가 필요없다
		Outer.Inner in = new Outer.Inner();  // Outer의 주소가 필요없다
		in.print();
		//Outer.Inner.Inner1.Inner2 in1 = new Outer.Inner.Inner1.Inner2();
	}
}

class Outer{
	static int a = 5; // 바깥 클래스의 스태틱변수
	int b = 10;       // 바깥 클래스의 멤버변수
	
	static class Inner{ // 내부 클래스는 static을 사용할 수 있다
		int c = 100;
		static int d = 1000;
		
		public void print() { // 내부 클래스의 멤버메소드
			System.out.println(d); 
		}
	}
}