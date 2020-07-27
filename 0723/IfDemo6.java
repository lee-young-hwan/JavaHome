/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class IfDemo6{
	public static void main(String[] args) {

		Student jimin = new Student();

		jimin.kor = 90;
		jimin.eng = 100;
		jimin.mat = 65;
		jimin.total = jimin.kor + jimin.eng + jimin.mat; // 총점

		jimin.avg = jimin.total /3.;

		jimin.grade = '\0';  // 0

        if(jimin.avg >= 90)
			jimin.grade = 'A';


		else if(jimin.avg >= 80)
			jimin.grade = 'B';


		else if(jimin.avg >= 70)
			jimin.grade = 'C';


		else if(jimin.avg >= 60)
			jimin.grade = 'D';


		else
			jimin.grade = 'F';

	}
}