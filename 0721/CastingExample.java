/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class CastingExample {
	public static void main(String[] args) {	
		/*int intValue = 44032;        // ������ ���ڷ� �ٲ�
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;   // ������ ������ �������� ����
		intValue = (int) doubleValue;
		System.out.println(intValue);*/

		// int age = (int)24L;
		byte age = 24;             // 
		double avg = 89;           // avg = 89.0

		age = (byte)avg;           // avg = 89

		byte a = 5;
		byte b = 9;
		byte sum = a + b;          // Java�� +�����ڸ� �ϸ� ������ �ҹ��ϰ� Int�� �ȴ�. ���� 4Byte�� Ÿ���� �ٸ��� ������ ������ ���� (-,*,/�� ��������)
	} 
}