
public class SecondArrayEx01 {
	public static void main(String[] args) {

		// 2차원 배열을 선언과 동시에 초기화하고 있음
		int[][] score = new int[][] { { 100, 100, 100 }, { 50, 50, 50 }, { 10, 20, 30 }, { 60, 20, 40 } };

		// 2차원 배열의 값을 읽고 쓰기 위해서는 더블루프가 반드시 필요하다
		
		for (int i =0; i <score.length; i++) {
			for(int j =0; j < score[i].length; j++) {  // 2차원 배열에서 j값은 주소값
				System.out.println(score[i][j]); 
			}
		}
		
		System.out.println("2차원 배열의 크기 : " + score.length);
		System.out.println("2차원 배열의 주소 : " + score);
		
		for(int i =0; i < score.length; i++) {
			System.out.println("1차원 배열의 크기 : " + score[i].length);
			System.out.println("1차원 배열의 주소 : " + score[i]);
		}

	}

}
