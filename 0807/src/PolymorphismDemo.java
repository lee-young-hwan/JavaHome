import java.util.Scanner;

public class PolymorphismDemo { // main함수
	public static void main(String[] args) {
		do {
		int choice = showMenu();
		if(choice == 5) break;
		process(choice);
	} while(true);
	}
	static void process(int choice) {
		
		Mammal bumo = null; // 지역변수는 항상 초기화 (선언형=부모, 실제형=자식)
		switch(choice) {
		case 1 : bumo = new Dog(); break;        // 부모형 = 자식형(Override)
		case 2 : bumo = new Cat(); break;        // 부모형 = 자식형(Override)
		case 3 : bumo = new Korean(); break;     // 부모형 = 자식형(Override)
		case 4 : bumo = new American(); break;   // 부모형 = 자식형(Override)
		}
		bumo.saySomething();  // 다형성
	}
	
	static int showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<Menu>>>>");
		System.out.println("1.Dog");
		System.out.println("2.Cat");
		System.out.println("3.Korean");
		System.out.println("4.American");
		System.out.println("5.Exit");
		System.out.print("당신은 어느 종족이십니까? :");
		int choice = scan.nextInt(); return choice;
	}
}
