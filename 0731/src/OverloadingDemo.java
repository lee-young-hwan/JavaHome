
/* Overloading : �޼ҵ��� �̸��� ����, �Ķ������ Ÿ���̳� ������ �ٸ��� �����Ϸ��� �ٸ� �޼ҵ�� �ν��Ѵ�.
     �޼ҵ��� �̸��� ���Ƶ� �Ķ������ ������ Ÿ���� �޶���Ѵ�(�����ε�)
   static void print(�޼ҵ�) = static void print(�޼ҵ�) , (int su)(�Ķ����) != (int su, double su1)(�Ķ����)
     �������ڴ� �׻� ������ ���� �־����    (Object...array, int su, double su1) = �̷������� ���� ��������
     */

public class OverloadingDemo {
public static void main(String[] args) {
	print(4, 89.5, 'A');
	print(89.5, 4, 'A');
}
 static void print(int su, double su1, Object...array) {}
 static void print(double su, int su1, Object...array) {}
}