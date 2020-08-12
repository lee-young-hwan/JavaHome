

public class AssertionDemo {
	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i < 101; i++) {
			sum = i;
		}
		//if (i > 100)
			//System.out.println("100번 반복 여부 확인할 것");
		assert i > 100 : "100번 반복 여부 확인할 것"; 
		assert sum > 100 : "누적 검사 필요 ";
		System.out.println("sum = " + sum);
	}
}
