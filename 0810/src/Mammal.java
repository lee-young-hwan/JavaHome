/*
 *  �߻�Ŭ������ ���� : �������� ����ȭ(������=�θ�, ������=�ڽ�)
 *  �߻�޼ҵ��� ���� : Override�� ����ȭ
 *  abstract�� final�� ���� �� �� ����
 *  abstract�� �ڽ��� ������ ��������
 *  �߻�Ŭ������ �ݵ�� �ڽĿ� ���ؼ��� �����ȴ�
 *  ���� ������ = �θ�޼ҵ带 �߻�޼ҵ�� ����
 */

public abstract class Mammal { 
	public String name;
	public Mammal(String name) {
		this.name = name;
	}
	
	public abstract void print(); // ����
}

class Lion extends Mammal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println("���� �ڽ��� �޼ҵ�");
	}
	
}
