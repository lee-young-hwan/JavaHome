/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

/*
 Class : Modeling�� ������ ��� ��� (��Ʋ)
 Object : 
 Instance : (��)

 �޸��� �ּ� Byte = 4Byte
 ��� Reference�� �׻� 4Byte��
*/

public class ReferenceDemo{
	public static void main(String[] args) {
		Car sonata; // ���� Car DataType, ������(class,interface,enum)�̱� ������ ���� �ƴ� �ּҸ� ����
		int age;
		
		age = 24;   // �Ҵ�
		sonata = new Car();          //��ü ����, new�� ���� �޸��� ��������� sonata�� �־��ش�
		sonata.name = "�ҳ�Ÿ";        //�Ҵ�, sonata�� �����ִ� �̸�
		sonata.price = 25_000_000;     //�Ҵ�, sonata�� �����ִ� ����
		sonata.maker = "�����ڵ���";    //sonata�� �����ִ� ����Ŀ

		

		Car carnival = new Car();   //����
		carnival.name = "ī�Ϲ�";     //�Ҵ�
		carnival.price = 35_000_000; 
		carnival.maker = "����ڵ���";

		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n", sonata.name, sonata.price, sonata.maker);

		System.out.printf("�̸� = %s, ���� = %d, ������ = %s\n", carnival.name, carnival.price, carnival.maker);

	}
}

class Car{
	String name;
	int price;
	String maker;
}