/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class OpDemo5{
	public static void main(String[] args) {
		//���� ������ ���� ������ �� : +, -, ~ �� ����� ������ int�� 
		//byte a = 5;
		//int result = ~a;
		//int result = -a;
		//System.out.println("result = " + result);

		//���׿���(���,�̵�,����,��Ʈ,��)�� ����� ������ int �̻�
		//byte + byte --> int, byte + short --> int, short * short --> int

		//byte a = 5;
		//byte b = 9;
		//byte sum = a & b; // +�� ���׿����ڱ� ������ ������ int �̻��̴�, ����Ʈ�����ڵ� ��������

		int a = 5, b = 9, x = 100;
		if(a < x | ++b > 20){              // && = ���� ��(a<x)�� �����̸� �ڿ� ��(++b>20)�� ��ǻ�Ͱ� �ƿ� ������� ����  
			System.out.println("��");      //   & = ���� ��(a<x)�� �����̶� �ڿ� ��(++b>20)���� ���� �����
		}

		else{
			System.out.println("����");
		}

		System.out.println("b = " + b);

	}
}