/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

import java.util.Arrays;

public class ArrayDemo3{
	public static void main(String[] args) {
		
		int [] original = {1,2,3,4,5,6,7,8,9,10}; // 10개
		int [] target = {10,9,8,7,6};  // 5개

		/*System.arraycopy(original, 0, target, 0, 3);
		System.out.println(Arrays.toString(target));

		original[0] = 1000;
		System.out.println(Arrays.toString(target));*/ // 값복사인 이유 (원본에 영향을 주지않음)

		
		target = original;  // 주소복사(deep copy)
		System.out.println(Arrays.toString(target));

		original[0] = 1000; 
		System.out.println(Arrays.toString(target));
		


	}
}