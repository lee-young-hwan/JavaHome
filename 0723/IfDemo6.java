/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class IfDemo6{
	public static void main(String[] args) {

		Student jimin = new Student();

		jimin.kor = 90;
		jimin.eng = 100;
		jimin.mat = 65;
		jimin.total = jimin.kor + jimin.eng + jimin.mat; // ����

		jimin.avg = jimin.total /3.;

		jimin.grade = '\0';  // 0

        if(jimin.avg >= 90)
			jimin.grade = 'A';


		else if(jimin.avg >= 80)
			jimin.grade = 'B';


		else if(jimin.avg >= 70)
			jimin.grade = 'C';


		else if(jimin.avg >= 60)
			jimin.grade = 'D';


		else
			jimin.grade = 'F';

	}
}