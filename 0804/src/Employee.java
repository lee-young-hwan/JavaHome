/*
 * class 설계시 변수를 멤버변수 또는 클래스변수 어느 것으로 결정할 것인가?
 * 멤버변수 : 멤버마다 각각 생성
 * 클래스변수 : 멤버들이 접근하기 위한 공유지역이기 때문에 단 1개만 생성
 * 멤버 변수 초기화는 초기화블록 / 생성자가 수행
 * 클래스변수 초기화는 static 초기화 블록이 수행
 */

public class Employee {
	private String name;
	private int salary;
	private static int count; // 여기서 static은 공유를 뜻함
	static{  // class Initialization block 클래스 초기화 블록
		count = 10;
	}
	
	{
		//Instance Initialization Block
		this.salary = 1000;
	}
	
	public Employee(String name) {
		this.name = name; 
		count++; // static은 this로 접근하지 않는다
	}
	
	public void print() {
		System.out.println("종업원수 = " + count);
	}
}
