import java.util.Scanner;

public class PolymorphismDemo { // main�Լ�
	public static void main(String[] args) {
		do {
		int choice = showMenu();
		if(choice == 5) break;
		process(choice);
	} while(true);
	}
	static void process(int choice) {
		
		Mammal bumo = null; // ���������� �׻� �ʱ�ȭ (������=�θ�, ������=�ڽ�)
		switch(choice) {
		case 1 : bumo = new Dog(); break;        // �θ��� = �ڽ���(Override)
		case 2 : bumo = new Cat(); break;        // �θ��� = �ڽ���(Override)
		case 3 : bumo = new Korean(); break;     // �θ��� = �ڽ���(Override)
		case 4 : bumo = new American(); break;   // �θ��� = �ڽ���(Override)
		}
		bumo.saySomething();  // ������
	}
	
	static int showMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<Menu>>>>");
		System.out.println("1.Dog");
		System.out.println("2.Cat");
		System.out.println("3.Korean");
		System.out.println("4.American");
		System.out.println("5.Exit");
		System.out.print("����� ��� �����̽ʴϱ�? :");
		int choice = scan.nextInt(); return choice;
	}
}
