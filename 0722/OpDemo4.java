/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class OpDemo4{
	public static void main(String[] args) {
		//int a = 5;
		//int b = 7;
		//boolean a = true;
		//boolean b = false;

		//System.out.printf(" a == b == > %b\n", (a==b)); // �⺻���� ���� ��
		//System.out.printf(" a == b == > %b\n", (a!=b));

		String name = new String("������"); //String = �ּҸ� ��             
		//.out.printf("������ == name ==> %b\n", ("������" == name));
		System.out.printf("������ == name ==> %b\n", ("������".equals(name))); // ���� ���� ���� equals ���
		//���ڿ��� �� �񱳴� == �����ڰ� �ƴ϶� equals() �޼ҵ� ���, new�� ���ų� �Ⱦ��ų� �ּҰ� �ƴ� ���� ������
		System.out.printf("������ == name ==> %d\n", ("������".compareTo(name))); // �������̶�� ������ �� ������-�������� ���̰�(�����ڵ�)�� 560�� ��
		//���ڿ��� �ּҸ� ���Ѵ�. ���� ����������!

	}
}