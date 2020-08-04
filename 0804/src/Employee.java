/*
 * class ����� ������ ������� �Ǵ� Ŭ�������� ��� ������ ������ ���ΰ�?
 * ������� : ������� ���� ����
 * Ŭ�������� : ������� �����ϱ� ���� ���������̱� ������ �� 1���� ����
 * ��� ���� �ʱ�ȭ�� �ʱ�ȭ��� / �����ڰ� ����
 * Ŭ�������� �ʱ�ȭ�� static �ʱ�ȭ ����� ����
 */

public class Employee {
	private String name;
	private int salary;
	private static int count; // ���⼭ static�� ������ ����
	static{  // class Initialization block Ŭ���� �ʱ�ȭ ���
		count = 10;
	}
	
	{
		//Instance Initialization Block
		this.salary = 1000;
	}
	
	public Employee(String name) {
		this.name = name; 
		count++; // static�� this�� �������� �ʴ´�
	}
	
	public void print() {
		System.out.println("�������� = " + count);
	}
}
