

public class SungjukMgmt {
public static void main(String[] args) {
	Student chulsu = new Student();
	input(chulsu);  // �л��� �ּ� 
	output(chulsu); 
}
 static void input(Student younghee){
	younghee.name = "�̿���";
	younghee.hakbun = "2020-001";
 }
 
 static void output(Student jimin){
	 System.out.println("�̸� = " + jimin.name);
	 System.out.println("�й� = " + jimin.hakbun);
 }
}
