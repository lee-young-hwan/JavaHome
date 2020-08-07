/*
 * Conversion / Cast
 * 1. Primitive Type
 * 1) �ڵ�����ȯ(�Ͻ�������ȯ, implicit conversion) ������ -> ū�� ��ȯ(Promotion, ����)
 * 	  4 + 89.5 = double,  123 + "Hello" = "123Hello"
 *    
 * 2) ��������ȯ(���������ȯ, explicit conversion) ū�� -> ������ ��ȯ(Demotion, ����)
 * 	  (int)89.5 = 89
 * 
 * 2. Reference Type
 * 1) �ڵ�����ȯ(�Ͻ�������ȯ, implicit conversion, Promotion, cast up)  �ڽ��� -> �θ��� ��ȯ  (��)
 * 2) ��������ȯ(���������ȯ, explicit conversion, Demotion, downward cast)   �θ��� -> �ڽ��� ��ȯ (��)
 * 
 * �θ� �ּҰ� �ڽ� �ּҷ� ���� ������
*/

public class ObjectConversion {
	public static void main(String[] args) {
		
		//Object obj = new Object(); // �θ�
		// String str = new String(); // �ڽ�
	//	obj = str;          // �ڵ�����ȯ
		Object obj;         // �θ��� ����
		obj = new String(); // �ڽ� ����   ,  ����(����) = ������(����)
		double avg = 4;
		
		if (obj instanceof String) System.out.println("true");
		 
		else System.out.println("false");
		
		
//		Test test = new Test();
//		Demo demo = new Demo();
//		//test = (Test)demo;     //�ڽ��� �θ�� ����ȯ�� �ȴ�
//		
//		if (test instanceof Demo) { // �θ� �ڽ����� ����ȯ�� ������ ���θ� �׽�Ʈ(instanceof ������)
//		demo = (Demo)test;       //�θ�� �ڽ����� ����ȯ�� ���� �ʴ´�
//		} else {
//			System.out.println("����ȯ �ȵ˴ϴ�."); 
//		}
	}
}

class Test{}

class Demo extends Test{}
