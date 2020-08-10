// Flag interface : ����� ���� ǥ�ø� �ϴ� �������̽�

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Demo d = new Demo(24);
		//Demo other = d; // �ּҺ���
		Demo other = (Demo)d.copy();
		// d.clone();
	}
}

class Demo extends Object implements Cloneable{  // implements Cloneable : ������ ��������
	public int age;

	public Demo(int age) {
		this.age = age;
	}

	public Object copy() {
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �����߽��ϴ�.");
		}
		return obj;
	}
}