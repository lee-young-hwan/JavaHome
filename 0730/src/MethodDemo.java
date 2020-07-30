

public class MethodDemo {
public static void main(String[] args) {
	MethodDemo md = new MethodDemo();
	int a = 40, b = 50; // argument(인자, 인수)
	
	int result = md.calcSum(a,b); // 이름에 의한 호출 : Call By Value
	System.out.println(a + "부터" + b + "까지의 합은 = " + result);
	
	a = 1; b = 30;
	result = md.calcSum(a, b);
	System.out.println(a + "부터" + b + "까지의 합은 = " + result);
	
	a = 50; b = 100;
	result = md.calcSum(50,100);
	System.out.println(a + "부터" + b + "까지의 합은 = " + result);
	
}
	int calcSum(int start, int end){ // parameter(매개변수), 지역변수
		                             // 메소드 (값복사)  int start = 40, int end = 50 
	int sum = 0;
	for ( int i = start; i <= end; i++)
	{
		sum += i;
	}
	return sum; // 반환타입
	}
}
