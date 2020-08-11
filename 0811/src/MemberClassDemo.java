

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		// out.a 멤버변수는 반드시 클래스의 주소가 필요하다
		Outer1.Inner1 in = out.new Inner1();
		in.print();
	}
}

class Outer1 extends Outer{
	int a1 = 50;  // 바깥클래스의 멤버변수(주소필요)
	static int b1 = 100; // 바깥클래스의 스태틱변수
	class Inner1 extends Inner{
		int c1 = 100;
		//static int d = 10000;
		public void print() { // 멤버 메소드
			System.out.println(b);
		}
	}
}