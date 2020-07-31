import java.util.Arrays;
import java.util.Scanner;

public class CallByRefDemo1 {
	public static void main(String[] args) {
		int [] array = input();
		output(array);
	}
	static int [] input(){            // 배열을 읽음, 참조형 반환타입, 주소쓰기 싫으면 static을 쓴다
		Scanner scan = new Scanner(System.in);
		int [] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.print("정수 >>"); array[i] = scan.nextInt(); 
		}
		return array;
	}  
	static void output(int [] array){ // 배열을 출력, 주소쓰기 싫으면 static을 쓴다
		System.out.println(Arrays.toString(array));
	} 
}
