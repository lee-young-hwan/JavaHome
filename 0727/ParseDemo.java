/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class ParseDemo{
	public static void main(String[] args) {
		/*String str = "128"; 
		int su = Integer.parseInt(str, 16);  // 16����   parseInt : ������ ���ڸ� ���ڷ� ��ȯ
		System.out.printf("su = %x\n" + su);*/


		int su = 128;
		// String str = "" + su;                 // ù��° ���  "128" (���� 128)

		// String str = String.valueOf(su);      // �ι�° ��� (���� 128)

		String str = Integer.toString(su, 16);   // ����° ��� (���� 128), su�� 16������ �ٲٶ�� ��
		System.out.printf("str = %s\n", str);



	}
}