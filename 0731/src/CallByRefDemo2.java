import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo2 {
	public static void main(String[] args) {
		int [] array = new int[1000];
		int su = input(array);
		output(array, su);
	}
	static int input(int [] array){            // 배열을 읽음, ★참조형 반환타입이 아니다★, 주소쓰기 싫으면 static을 쓴다
		Scanner scan = new Scanner(System.in);
		int su = 0;
		int i = 0;
		System.out.println("정수 입력(0은 종료)");
		while((su = scan.nextInt()) != 0 && i < 1000) { // 정수 입력을 받았는데 su가 0이 아니면 참
			array[i++] = su;
		}		
		return i;
	}  
	static void output(int[] array, int su){ // 배열을 출력, 주소쓰기 싫으면 static을 쓴다
		for (int i = 0; i < su; i++) {
			System.out.print(array[i] + "\t");
		}
	} 
}
