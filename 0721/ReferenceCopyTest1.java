/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ReferenceCopyTest1{
	public static void main(String[] args) {
		
		Student chulsu = new Student();
		chulsu.age = 24;

		Student younghee = new Student();
		
		younghee = chulsu; // ������ �����߱� ������ �ּҺ��� (younghee = chulsu�� Student Type�̱� ������ Reference Ÿ��)

		//Student younghee = new Student();
		//younghee.age = chulsu.age;

		System.out.printf("ö���� ���� = %d,", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);

		chulsu.age = 34;
		
		System.out.printf("ö���� ���� = %d,", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);

	}
}