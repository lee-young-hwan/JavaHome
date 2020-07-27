/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class ConstantDemo {
	 public static void main(String[] args) {
		//final double PI = 3.141592; //변수
		//System.out.printf("pi의 값은 %f입니다.\n", PI);
		//pi = 3.2;

		/*int max;
		max = Integer.MAX_VALUE; //Integer = 클래스변수
		System.out.println("가장 큰 값은 " + max);
		System.out.println("가장 큰 값 다음 값은 " + (max + 1));*/

		byte min;
		min = Byte.MIN_VALUE;
		System.out.printf("가장 작은 값보다 더 작은 값은 %d입니다.\n", (byte)(min-1));  //(min-1) <- int 값을 byte값으로 줄인다는 뜻
		System.out.println("가장 작은 값보다 더 작은 값은 " + (byte)(min-1) + "입니다");//(byte)를 형변환 연산자라고 함

	}
}