/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

/*
	Ŭ�������� : static variable
	 -Ŭ������ �̸����� �����Ѵ�
	 Integer.MAX_VALUE, Short.MAX_VALUE, Byte.MAX_VALUE
	 -�Ҽ� Ŭ������ �ּҸ� ������ �ʿ䰡 ����
	 -�ڵ����� DataType�� ���� �ʱⰪ�� �־�����. (False�� �ʱⰪ)
	 -������ : 0
	 -�Ǽ��� : 0.0
	 -Boolean : false
	 -������ : '\0', '\u0000'(NULL��)
	 -������ : null(NULL����)
*/

public class StaticVariableDemo{

	static int age; // Class Variable, static Variable

	public static void main(String[] args) {
		
		// int age; // ��������

	/*	System.out.println("���� = " + age);
		System.out.println("���� = " + StaticVariableDemo.age);
		StaticVariableDemo svd = new StaticVariableDemo(); // svd = �ּҺ���
		System.out.println("���� = " + svd.age);*/
		
		Product.price = 25_000_000;
		System.out.println("������ = " + Product.price);
	}
}

class Product
{
	static int price; //Ŭ���� ����
}