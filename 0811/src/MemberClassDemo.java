

public class MemberClassDemo {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		// out.a ��������� �ݵ�� Ŭ������ �ּҰ� �ʿ��ϴ�
		Outer1.Inner1 in = out.new Inner1();
		in.print();
	}
}

class Outer1 extends Outer{
	int a1 = 50;  // �ٱ�Ŭ������ �������(�ּ��ʿ�)
	static int b1 = 100; // �ٱ�Ŭ������ ����ƽ����
	class Inner1 extends Inner{
		int c1 = 100;
		//static int d = 10000;
		public void print() { // ��� �޼ҵ�
			System.out.println(b);
		}
	}
}