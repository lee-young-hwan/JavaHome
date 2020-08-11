/*
 * static의 4가지 용법
 * 1. static 변수 : 공유의 목적
 * 2. static 메소드 : 주소 없이 접근
 * 3. static 초기화 블록 : static 변수(상수) 초기화
 * 4. static class : 패키징
 */

public class StaticDemo {
	public static void main(String[] args) {
		Student[] array = new Student[3];
		for (int i = 0; i < array.length; i++)
			array[i] = new Student();
		for (Student s : array)
			System.out.println(s); // s.toString()
		Student.print(); // 주소 없이 접근
	}
}

class Student {
	public int count; // 멤버 변수
	public static int su; // static 변수

	public Student() { // 생성자
		count++;
		su++;
	}
	
	public static void print() {
		System.out.println("Hello");
	}

	@Override
	public String toString() { // static이 없으니까 멤버 메소드(s의 주소로 접근)
		return String.format("count =%d, su = %d", this.count, su);
	}
}