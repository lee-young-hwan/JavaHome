/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Arrays;

public class ArrayDemo8{
	public static void main(String[] args) {

		Student chulsu = new Student();
		chulsu.name = "��ö��";

		Student younghee = new Student();
		younghee.name = "�̿���";

		Student jimin = new Student();
		jimin.name = "������";


		Student [] original = {chulsu, younghee, jimin};

		Student [] target = new Student[5];

		//original �迭�� ù �л����� 3���� target �迭�� �����ϱ�
		//System.arraycopy(original,0, target, 0, original.length); // �迭�� ������

		target = original; // �ּҺ���

		for (Student std : target)
		{
			if (std != null)
			{
				System.out.println(std.name);
			}
		}
	}
}