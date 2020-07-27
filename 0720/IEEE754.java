/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class IEEE754{
	public static void main(String[] args) {
		float original = 25.5f;
		int result = Float.floatToIntBits(original);
		System.out.printf("result = %x\n", result);

		double target = 25.5;
		long result1 = Double.doubleToRawLongBits(target);
		System.out.printf("result1 = %x\n", result1);
	}
}