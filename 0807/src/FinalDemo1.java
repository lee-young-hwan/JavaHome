

public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
	}
}

class Super{
	public  void print() {  // final을 쓰면 재정의를 할 수 없음(Override를 할수없음)
		System.out.println("나는 부모의 메소드");
	}
}

class Sub extends Super{
	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");
}
}
