/*
 *  Constant ���
 *  1. �������
 *  2. ������
 *  3. Ŭ�������
 */

public class FinalDemo {
	int age;    // �������
	final double PI; // ������
	static int kor; // static����
	static final int ENG; // static���
	static{ // static �ʱ�ȭ ���
		kor = 90; // static variable �ʱ�ȭ
		ENG = 100; // static constant �ʱ�ȭ
	}
		
	public FinalDemo() { // ������(����� ������ ���� �������ʿ�)
		this.age = 24;   // ������� �ʱ�ȭ
		this.PI = 3.14;  // ������ �ʱ�ȭ
	}
	
	public static void main(String[] args) {
		final String NAME = "������"; // �������
		//NAME = "������";
	}
}
