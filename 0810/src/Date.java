/*
 * 3. ���߰��� ��ӿ��� implements�� ����Ѵ�.
 * 4. �θ� interface�� �߻�޼ҵ带 �������� ������ �ݵ�� public ���� �����ڸ� ����ؾ� �Ѵ�.
 */

public class Date implements Datable {
	private int date;

	@Override
	public void set(int date) {
		
		this.date = date;
	}

	@Override
	public int get() {
		
		return this.date;
	}

}
