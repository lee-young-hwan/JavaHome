
// �Ķ������ ������ �޶�� �Ѵ�
// this �޼ҵ�� ������ ���� ù��° �;��Ѵ�
public class Student { 
	private String name;
	private int age;
	
	public Student() {
		//Student s = new Student("Unknown", 20);
		this("Unknown",20);
	}
	
	public Student(String name) {
		//this.name = name;
		//Student s = new Student(name, 20);
		this(name,20);
	}
	
	public Student(int age) {
		//this.age = age;
		//Student s = new Student("Unknown", age);
		this("Unknown",age);
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("�̸� = " + name + ", ���� = " + age);
	}
	
	
	
}