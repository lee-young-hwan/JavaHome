/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/
import java.util.Scanner;
public class Account{
	public static void main(String[] args) {
		
		

		Scanner scan;

		String id;
		String password;
		String name;
		String email;

		scan = new Scanner(System.in);


		System.out.print("id : ");
		id = scan.nextLine();
        System.out.println("귀하의 id는 " + id + "이군요.");

		
		System.out.print("password : ");
		password = scan.nextLine();
        System.out.println("귀하의 password는 " + password + "이군요.");

		
		System.out.print("name : ");
		name = scan.nextLine();
		System.out.println("귀하의 name은 " + name + "이군요.");

		
		System.out.print("email : ");
		email = scan.nextLine();
		System.out.println("귀하의 email은 " + email + "이군요.");

	}
}