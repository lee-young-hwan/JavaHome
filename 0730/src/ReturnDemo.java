import java.util.Scanner;

public class ReturnDemo {
public static void main(String[] args) {
	// 키와 몸무게를 입력받는 부분
	Scanner scan = new Scanner(System.in);
	System.out.print("키 : ");
	double height = scan.nextDouble();
	
	System.out.print("몸무게 : ");
	double weight = scan.nextDouble();
	
	ReturnDemo rd = new ReturnDemo();
	double bmi = rd.calcBmi(height * 0.01, weight); // call by value 
	rd.printLevel(bmi);
}
 // BMI 지수 계산하는 부분, prototype
	double calcBmi(double height, double weight) {
		// 이미 height 단위가 meter 단위라면
		double bmi = weight / (height * height);
		return bmi;
	}
	
// BMI 지수에 의한 6단계 레벨값 출력하는 부분
	void printLevel(double bmi) {
		System.out.println("bmi = " + bmi);
		if (bmi >= 40) System.out.println("고도 비만");
		else if (bmi >= 35 && bmi < 40) System.out.println("중증도 비만");
		else if (bmi >= 30 && bmi < 35) System.out.println("경도 비만");
		else if (bmi >= 25 && bmi < 30) System.out.println("과체중");
		else if (bmi >= 18.5 && bmi < 25) System.out.println("정상");
		else if (bmi < 18.5) System.out.println("저체중");
		return ;   // return 뒤에 아무것도 없으면 void
	
	}
 
} 
