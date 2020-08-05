import java.util.Scanner;

public class Input {
	private Student [] array; //선언
	private Scanner scan;     //선언
	public Input(Student [] array) {
		this.array = array;
		this.scan = new Scanner(System.in);
	}
	public void input() {              // 입력받을 학생 , new 안쓰려고 static입력}
	
	for (int i = 0; i < array.length; i++) {
		 // 학생 생성해서 주소에 대입(중요)
		System.out.println("<<" + (i+1) + "번째 학생 입력>>");
		System.out.print("학번 : ");    String hakbun = scan.next();
		System.out.print("이름 : ");    String name = scan.next();
		System.out.print("국어 : ");    int kor = scan.nextInt();
		System.out.print("영어 : ");    int eng = scan.nextInt();
		System.out.print("수학 : ");    int mat = scan.nextInt();
		
		Student s = new Student(hakbun, name, kor, eng, mat);
		this.array[i] = s;
		
		
	}
}
}
