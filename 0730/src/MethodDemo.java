

public class MethodDemo {
public static void main(String[] args) {
	MethodDemo md = new MethodDemo();
	int a = 40, b = 50; // argument(����, �μ�)
	
	int result = md.calcSum(a,b); // �̸��� ���� ȣ�� : Call By Value
	System.out.println(a + "����" + b + "������ ���� = " + result);
	
	a = 1; b = 30;
	result = md.calcSum(a, b);
	System.out.println(a + "����" + b + "������ ���� = " + result);
	
	a = 50; b = 100;
	result = md.calcSum(50,100);
	System.out.println(a + "����" + b + "������ ���� = " + result);
	
}
	int calcSum(int start, int end){ // parameter(�Ű�����), ��������
		                             // �޼ҵ� (������)  int start = 40, int end = 50 
	int sum = 0;
	for ( int i = start; i <= end; i++)
	{
		sum += i;
	}
	return sum; // ��ȯŸ��
	}
}
