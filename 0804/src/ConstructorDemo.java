

public class ConstructorDemo {
	String name;
	int price;
	boolean flag;
	double avg;
	
	public ConstructorDemo() {
		this.name = "วัม๖นฮ"; 
		this.price = 0;
		this.flag = false;
		this.avg = 0.0;
	}
	
public static void main(String[] args) {
	ConstructorDemo cd = new ConstructorDemo();
	System.out.println("name = " + cd.name);
	System.out.println("price = " + cd.price);
	System.out.println("flag = " + cd.flag);
	System.out.println("avg = " + cd.avg);
	String str = new String();
}
}
