

public enum Week { // ������ Ÿ���� �ʿ����. (public static final �� data type�� ����������)
	SUN(0), MON(100), TUE(101), WED(1000), THU(1001), FRI(10000), SAT(50000);  // ��׵��� ���� ���� ���;���
	public int value;
	Week(int value){ // ������
		this.value = value;
	}
		public int getValue() {return this.value;}
}
