/*
 * 1. ���(Constant) : �������, ������, Ŭ���� ���
 *  1) �ݵ�� �ʱ�ȭ �ؾ� �Ѵ�.
 *  2) ����� �̸��� ��� �빮�ڷ� ǥ���ϰ�, �߰��� ������ ��쿡�� '_'�� ����Ѵ�.
 *     int KOR = 90; // �������
 *  3) ��� ��� �ʱ�ȭ�� �����ڿ� instance initialization block�� �ʱ�ȭ
 *  4) Ŭ���� ��� �ʱ�ȭ�� static initialization block�� �ʱ�ȭ (Ŭ���� ������ �ʱ�ȭ)
 *  
 * 2. final method : ������ ����
 * 3. final class : ��� ����
 */

public class FinalDemo {
	public static void main(String[] args) {
		
	}
}

final class Parent{
		public void display() {System.out.println("���� �θ��� �޼ҵ�");}
		public void print() {System.out.println("���� �θ��� �޼ҵ�");}
}
