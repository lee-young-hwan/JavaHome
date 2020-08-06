

public class Student extends Human {
	private String major;
	
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}


	@Override
	public String toString() {
		return "Student [name =" + getName() + ", age =" + getAge() + ", major =" + major + "]";
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}
	
	


}
