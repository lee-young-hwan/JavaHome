

public class InheritanceDemo2 {
	private String name;
	public static void main(String[] args) {
		
		Derived d = new Derived(100, "วัม๖นฮ");
	}
}

class Base{
	private String name;
	public Base(String name) {
		this.name = name;
	}
	public void printBase() {
		System.out.println("name = " + this.name);
	}
}

class Derived extends Base{
	private int salary;
//	public Derived(int salary) {
//		this.salary = salary;
//	}
	public Derived(int salary, String name) {
		super(name); 
		this.salary = salary;
//		this(salary);
	}
}
