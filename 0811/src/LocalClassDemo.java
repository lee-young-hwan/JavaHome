

public class LocalClassDemo {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.print();
	}
}

class Outer2{
	int a =5; // �ٱ�Ŭ������ ��� ����
	static int b = 10; // �ٱ�Ŭ������ ����ƽ ����
	public void print() {  // �ٱ�Ŭ������ ��� �޼ҵ�
		 final int c = 50;    // ��������
		 class Inner2 { // ����Ŭ����
			public void display() {
				System.out.println(c);
			}
			
		}
	
		Inner2 in = new Inner2();
		in.display();
	}
}
