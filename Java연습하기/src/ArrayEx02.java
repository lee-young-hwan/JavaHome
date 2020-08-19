

public class ArrayEx02 {
	public static void main(String[] args) {
		
		int sum = 0;  // 총점
		double avg = 0.0; // 평균
		
		int [] score = new int[] {100,90,80, 50, 70}; // 선언과 동시에 초기화
		
		System.out.println("배열의 크기 : " + score.length);
		
		// 배열의 합
		for (int i =0; i < score.length; i++) {
			sum += score[i];
		}
		
		// 평균
		avg = sum / score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
