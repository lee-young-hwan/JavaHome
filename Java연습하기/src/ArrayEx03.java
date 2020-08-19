

public class ArrayEx03 {
	public static void main(String[] args) {
		
		// 40바이트
		int [] arr1 = new int[10];
		
		// arr1 배열에 난수를 10개 대입하고 있다.
		for(int i =0; i < arr1.length; i++) {
			
			// 범위 : 1~10의 난수
			arr1[i] = (int)(Math.random() * 10) + 1;
		}
		
		// 배열의 값들을 출력하는 코드
		for(int i =0; i < arr1.length; i++) {
			
			if(i == 9) {
			System.out.print(arr1[i]);
		}
		
		else {
			System.out.print(arr1[i] + ", ");
		}
			
		}
	}
}
	

