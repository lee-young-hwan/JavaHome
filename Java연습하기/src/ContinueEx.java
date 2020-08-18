
public class ContinueEx {
	public static void main(String[] args) {
		
		// 1~100에서 홀수만 출력하기
		
//		for (int i = 1; i <=100; i++) {
//			
//			if ((i % 2) != 0) {
//				continue;
//			}
//			
//			System.out.println("짝수만 출력 : " + i);
//			
//		}
		
		
		for (int i = 1; i <=100; i++) {
		
		if ((i % 2) == 0 && (i%3 == 0)) {
			//continue;
			System.out.println("2와 3의 공배수 : " + i);
		}
		
//		System.out.println("2의 배수와 3의 배수를 출력 : " + i);
		
	}
		
		
		// 소수를 구하는 프로그램을 작성해보기
		
		
	}
}
