

public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
	}
}

class Super{
	public  void print() {  // final�� ���� �����Ǹ� �� �� ����(Override�� �Ҽ�����)
		System.out.println("���� �θ��� �޼ҵ�");
	}
}

class Sub extends Super{
	@Override
	public void print() {
		System.out.println("���� �ڽ��� �޼ҵ�");
}
}
