import java.util.Date;

public class OverrideDemo {
	public static void main(String[] args) {
		Integer in = new Integer(100);
		System.out.println(in.toString());
		System.out.println(in);
		
		Demo d = new Demo();
		System.out.println(d.toString());
		System.out.println(d);
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
	}
}

class Demo extends Object{
	String name = "한지민";
	@Override // 의도적으로 재정의한다는 뜻
	public String toString() {
		//return "이름은 " + this.name + "입니다.";
		return String.format("이름은 %s 입니다.%n", this.name);  // (서식,대상)
	}
}