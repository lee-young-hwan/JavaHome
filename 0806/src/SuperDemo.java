/*
 * this�� ���
 * 1. this. : ����, ���� ��������� ��� �޼ҵ带 ��������� ��Ī�ϰ��� �� ��
 * 2. this
 * 3. this()
 * 
 * super�� ���
 * 1. super : �θ���, �θ��� (�������)�� ����޼ҵ带 ��������� ��Ī�ϰ��� �� ��
 * 2. super()
 * 
 */

public class SuperDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();    //System.out.println(jasik.name);
	}
}

class Bumo{
	String name = "������";
	protected void print() {
		
	}
}

class Jasik extends Bumo{
	int name = 100;
	@Override // �ǵ������� �ڵ��Ҷ� ���
	public void print() {
		System.out.println("�ڽ��� �޼ҵ�");
	}
}