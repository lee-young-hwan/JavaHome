/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Arrays;

public class SungjukMgmt{
	public static void main(String[] args) {

		Student [] array; //선언
		array = new Student[2];   // new를 한번더 선언


		array[0] = new Student(); // new를 한번더 선언
		array[0].name = "김철수";
		array[0].kor = 80;
		array[0].eng = 87;
		array[0].mat = 96;


		array[1] = new Student();
		array[1].name = "이영희";
		array[1].kor = 90;
		array[1].eng = 95;
		array[1].mat = 89;

		// for (int i = 0; i < array.length; i++)

		for ( Student std : array )
		{
			std.tot = std.kor + std.eng + std.mat;
			std.avg = std.tot / 3.;
		}

		//System.out.println(java.util.Arrays.toString(array));
		//자바는 클래스명@hash코드(식별 가능한 메모리번지)


		for (int i = 0;i < array.length ;i++)
		{
			System.out.printf("%s, %d, %d, %d, %d, %.1f\n" , array[i].name, array[i].kor, array[i].eng, array[i].mat, array[i].tot, array[i].avg);
		}

	}
}