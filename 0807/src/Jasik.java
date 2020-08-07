

public class Jasik extends Bumo{
	private int age;

	public Jasik(String name, int age) {
		super(name);
		this.age = age;
	}

	@Override
	public String toString() {
		//return "Jasik [age=" + age + "]";
		return super.toString(); // 부모의 주소로 출력
	}
	
	@Override
	public void print() {
		System.out.println("나는 자식 메소드");
	}
	
	public void display() { // 재정의가 되지 않아서 접근할 수가 없음
		                    // Bumo 메소드에 display가 없기 떄문이다
		System.out.println("나는 자식의 일반 메소드");
	}
}
