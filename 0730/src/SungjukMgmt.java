

public class SungjukMgmt {
public static void main(String[] args) {
	Student chulsu = new Student();
	input(chulsu);  // 학생의 주소 
	output(chulsu); 
}
 static void input(Student younghee){
	younghee.name = "이영희";
	younghee.hakbun = "2020-001";
 }
 
 static void output(Student jimin){
	 System.out.println("이름 = " + jimin.name);
	 System.out.println("학번 = " + jimin.hakbun);
 }
}
