

public class LocalClassDemo {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.print();
	}
}

class Outer2{
	int a =5; // 바깥클래스의 멤버 변수
	static int b = 10; // 바깥클래스의 스태틱 변수
	public void print() {  // 바깥클래스의 멤버 메소드
		 final int c = 50;    // 지역변수
		 class Inner2 { // 지역클래스
			public void display() {
				System.out.println(c);
			}
			
		}
	
		Inner2 in = new Inner2();
		in.display();
	}
}
