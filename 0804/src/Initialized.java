

public class Initialized {

	private int x; //= 5;
	private String name; //= "Fred";
	
	
	public Initialized(int x, String name) { // �⺻�����ڰ� �ƴ� �Ϲ� ������
		this.x = x; this.name = name;
	}
	
public Initialized(int x) { // �������� �����ε�
	this.x = x;
}	

public Initialized(String name) { // �������� �����ε�
	this.name = name;
}

public static void main(String[] args) {
	Initialized in = new Initialized("������");
	System.out.println(in.x);
	System.out.println(in.name);
}
}
