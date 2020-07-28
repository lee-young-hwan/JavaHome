/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Arrays;

public class ArrayDemo8{
	public static void main(String[] args) {

		Student chulsu = new Student();
		chulsu.name = "김철수";

		Student younghee = new Student();
		younghee.name = "이영희";

		Student jimin = new Student();
		jimin.name = "한지민";


		Student [] original = {chulsu, younghee, jimin};

		Student [] target = new Student[5];

		//original 배열의 첫 학생부터 3명을 target 배열에 복사하기
		//System.arraycopy(original,0, target, 0, original.length); // 배열의 값복사

		target = original; // 주소복사

		for (Student std : target)
		{
			if (std != null)
			{
				System.out.println(std.name);
			}
		}
	}
}