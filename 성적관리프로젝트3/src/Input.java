import java.util.Scanner;

public class Input {
	static void input(Student [] array) {              // 입력받을 학생 , new 안쓰려고 static입력}
		Scanner scan = new Scanner(System.in);
	for (int i = 0; i < array.length; i++) {
		array[i] = new Student();  // 학생 생성해서 주소에 대입(중요)
		System.out.println("<<" + (i+1) + "번째 학생 입력>>");
		
		System.out.print("학번 : ");    String hakbun = scan.next();
		System.out.print("이름 : ");    String name = scan.next();
		System.out.print("국어 : ");    int kor = scan.nextInt();
		System.out.print("영어 : ");    int eng = scan.nextInt();
		System.out.print("수학 : ");    int mat = scan.nextInt();
		array[i].setHakbun(hakbun); 
		array[i].setName(name); 
		array[i].setKor(kor);
		array[i].setEng(eng); 
		array[i].setMat(mat);
	}
}
}
