/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ReferenceCopyTest2{
	public static void main(String[] args) {
												// String�� ���ܷ� ������������ �ּҺ��簡 ���� �ʴ´�
		String original = "Hello";				// original = ����, Hello = ���
		String copy = original;
		System.out.printf("original = %s, copy = %s\n", original, copy);

		original = "World";
        System.out.printf("original = %s, copy = %s\n", original, copy);

		
	}
}