/*
�ۼ��� : �̿�ȯ
�ۼ����� : literal ����
�ۼ��Ͻ� : 2020.7.17
�ۼ�ȯ�� : Windows 10, OpenJDK 14.0.2, EditPlus 5.3

 Literal
 1. ������ Literal : +,- ��ȣ, 24(10����), 24L, 0234(8����), 0xABCD(16����), 0b0111001(2����)
 2. �Ǽ��� Literal : +,- ��ȣ, 3.14(�Ǽ�������), 3.14d(d�� ��������), 3.14f(4Byte ������), 3.14e-2(������������), 
 3. ������ Literal : 'A'(���ڵ�����), '\n'(escape sequence, Ư������)
 4. ���ڿ��� Literal : "������ ���ﵿ �ѵ�����"
 5. Boolean�� Literal : true, false
*/

public class LiteralDemo{
	public static void main(String[] args) {
		// �������(��� format)
		// System.out.printf("�������", ��´��)
		/*
		System.out.printf("%d\n", 24);
		System.out.println();
		System.out.printf("%o\n", 24);
		System.out.println();
		System.out.printf("%x", 24);
		System.out.println(Integer, toBinaryString(24));
		System.out.println("-----------------------");
		System.out.printf("%d\n", 0244);
		System.out.printf("%o\n", 0244);
		System.out.printf("%x\n", 0244);
		System.out.println(Integer, toBinaryString(0244));
		System.out.println("-----------------------");
		System.out.printf("%d\n", 0xCAFE);
		System.out.printf("%o\n", 0xCAFE);
		System.out.printf("%x\n", 0xCAFE);
		System.out.println(Integer, toBinaryString(0xCAFE)); 
		*/
		/*
		System.out.printf("%d\n", 0b0001111);
		System.out.printf("%o\n", 0b0001111);
		System.out.printf("%x\n", 0b0001111);
		System.out.println(Integer.toBinaryString(0b0001111));
		*/
		//System.out.println(Integer.toBinaryString(-24));
		//System.out.println(Long.toBinaryString(-24L));

		System.out.printf("%o\n", 24);
		System.out.println(Integer.toOctalString(24));


	}
}