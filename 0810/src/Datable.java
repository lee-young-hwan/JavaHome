/*
 * 1. interface���� public static final�� ������ ����� ���� �� �ִ�.
 * 2. interface���� ��� �޼ҵ尡 public abstract�̰� ���������ϴ�.
 */

public interface Datable {
	int SUN = 0, MON = 1, TUE = 2, WED= 3, THU = 4, FRI = 5, SAT = 6;
	void set(int date);
	int get();
	
}
