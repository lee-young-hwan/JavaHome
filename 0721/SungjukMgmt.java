/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class SungjukMgmt{
	public static void main(String[] args) {
		Student chulsu = new Student();
		Student.mat = 100; // static�����̱� ������ ������ ���� ���� ���������� 1���� ����
		chulsu.kor = 90; // ��������̱� ������ ������ ����� �Ȱ��� ���������� �������� ����
		chulsu.eng = 85; // ��������̱� ������ ������ ����� �Ȱ��� ���������� �������� ����

		int total = chulsu.kor + chulsu.eng + Student.mat;
		System.out.println("ö���� ���� = " + total);

		Student younghee = new Student();
		younghee.kor = 95;
		younghee.eng = 100;
		//������ ���������� ö���� �����Ǳ� ������ �������� �ʾƵ���
		total = younghee.kor + younghee.eng + Student.mat;
		System.out.println("������ ���� = ", total);
	}
}
