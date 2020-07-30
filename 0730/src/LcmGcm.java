import java.util.Scanner;

public class LcmGcm {
public static void main(String[] args) {
	// 정수 2개 입력받는 부분
	Scanner scan = new Scanner(System.in);
	System.out.print("첫번째 수 : "); int a = scan.nextInt();
	System.out.print("두번째 수 : "); int b = scan.nextInt(); // 인자, 인수, argument
	int gcm = calcGcm(a,b);       // Call By Value
	int lcm = calcLcm(a, b, gcm); // Call By Value
	printResult(a, b, gcm, lcm);  //  
	
} 
	// 최대공약수를 구하는 부분
	static int calcGcm(int a, int b)
	{
	int gcm = 0;
	
		for (int i = 2; i <= a; i++)
		{
			if(a % i == 0 && b % i == 0) gcm = i;
		}
		return gcm;
	
	}
	// 최소공배수를 구하는 부분
	static int calcLcm(int a, int b, int gcm)
	{
		return a / gcm * b / gcm * gcm;  // LCM = abG
	}

	// 정수 2개의 최대공약수와 최소공배수를 출력하는 부분
	static void printResult(int a, int b, int gcm, int lcm)
	{
		System.out.printf("%d와 %d의 최대공약수는 %d이고 최소공배수는 %d입니다.\n", a, b, gcm, lcm);
	}
}
