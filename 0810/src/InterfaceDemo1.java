/*
 * 5. interface�� �߻�Ŭ������ �����̱� ������ ���� new�� �ν��Ͻ�ȭ �� �� ����. �׷��� ���������� �����ؾ� �Ѵ�.
 * 6. interface�� ����� static ����̱� ������ ������ �� ����, interface �̸����� �����ؾ� �Ѵ�.
 */

public class InterfaceDemo1 {
	public static void main(String[] args) {
		//Datable d = new Datable();
		Datable d = new Date();
		d.set(Datable.FRI);
		System.out.println(d.get());
	}
}
