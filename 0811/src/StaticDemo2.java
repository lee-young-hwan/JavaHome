/*
 *  1. static�� ����� ������ �ȵ�
 *  2. ����� static���� ���� ����
 */

public class StaticDemo2 {
	public static void main(String[] args) {
		// Outer.a a�� ����ƽ �����̱� ������ Outer�� �ּҰ� �ʿ����
		Outer.Inner in = new Outer.Inner();  // Outer�� �ּҰ� �ʿ����
		in.print();
		//Outer.Inner.Inner1.Inner2 in1 = new Outer.Inner.Inner1.Inner2();
	}
}

class Outer{
	static int a = 5; // �ٱ� Ŭ������ ����ƽ����
	int b = 10;       // �ٱ� Ŭ������ �������
	
	static class Inner{ // ���� Ŭ������ static�� ����� �� �ִ�
		int c = 100;
		static int d = 1000;
		
		public void print() { // ���� Ŭ������ ����޼ҵ�
			System.out.println(d); 
		}
	}
}