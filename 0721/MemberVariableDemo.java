/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

/*
	Meber variable : Instance variable
	-�ڵ����� ������ �ʱⰪ�� �־����� (class ������ ����)
	-��������� �ּҷ� �����Ѵ�
*/

public class MemberVariableDemo{
	
	//static int age; //Ŭ��������
	int age;        // �������, ���������� ��������� �ٿ��� �Ѵ� (������ ���� �ʴ´�)

	public static void main(String[] args) {
		//int age;    // ��������, ���������� ����� static�� ���� �� ����
		
		MemberVariableDemo mvd = new MemberVariableDemo();

		System.out.println("���� = " + mvd.age);
	}
}