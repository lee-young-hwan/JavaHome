/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ReferenceCopyTest{
	public static void main(String[] args) {

		Student chulsu = new Student();
		chulsu.age = 24;  // chulsu = ��������

		Student younghee = new Student();
		younghee.age = chulsu.age; // younghee = ��������

		System.out.printf("ö���� ���� = %d,", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);

		chulsu.age = 34;
		
		System.out.printf("ö���� ���� = %d,", chulsu.age);
		System.out.printf("������ ���� = %d\n", younghee.age);

		/*

		1.��� : int�̱� ������ primivate Ÿ���̾ �⺻�� (������)
		

		*/


	}
}

class Student
{
	int age;
}