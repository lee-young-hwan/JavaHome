
// 멤버변수 초기화 = 생성자
// 클래스변수 초기화 = 클래스 초기화 블록
public class InstanceInitializationBlock {
public static void main(String[] args) {
	Car car = new Car(); car.print();
}
}
class Car{
	// private String name = "소나타"; // 명시적 초기화
	private String name;
	{
		System.out.println("나는 초기화 블록"); 
		this.name = "카니발";
	}
	
	public Car() {
		System.out.println("나는 생성자입니다.");
		this.name = "소나타";
	}
	
	public void print() {
		System.out.println("name = " + this.name);
	}
}