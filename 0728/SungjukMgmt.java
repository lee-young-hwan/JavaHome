/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

import java.util.Arrays;

public class SungjukMgmt{
	public static void main(String[] args) {

		Student [] array; //����
		array = new Student[2];   // new�� �ѹ��� ����


		array[0] = new Student(); // new�� �ѹ��� ����
		array[0].name = "��ö��";
		array[0].kor = 80;
		array[0].eng = 87;
		array[0].mat = 96;


		array[1] = new Student();
		array[1].name = "�̿���";
		array[1].kor = 90;
		array[1].eng = 95;
		array[1].mat = 89;

		// for (int i = 0; i < array.length; i++)

		for ( Student std : array )
		{
			std.tot = std.kor + std.eng + std.mat;
			std.avg = std.tot / 3.;
		}

		//System.out.println(java.util.Arrays.toString(array));
		//�ڹٴ� Ŭ������@hash�ڵ�(�ĺ� ������ �޸𸮹���)


		for (int i = 0;i < array.length ;i++)
		{
			System.out.printf("%s, %d, %d, %d, %d, %.1f\n" , array[i].name, array[i].kor, array[i].eng, array[i].mat, array[i].tot, array[i].avg);
		}

	}
}