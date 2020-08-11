

public enum Week { // 데이터 타입이 필요없다. (public static final 과 data type이 생략되있음)
	SUN(0), MON(100), TUE(101), WED(1000), THU(1001), FRI(10000), SAT(50000);  // 얘네들이 가장 먼저 나와야함
	public int value;
	Week(int value){ // 생성자
		this.value = value;
	}
		public int getValue() {return this.value;}
}
