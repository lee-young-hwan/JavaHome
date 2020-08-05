

public class Account {                                                             // 1.bmi와 level은 계산할떄 만들어진다 (자동생성x)
	private String name, level;
	private double height, weight, bmi;
	private int age;
	
	public Account(String name, double height, double weight, int age) {           // 2.source -> using field
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	

	public String getName() {                                                      // 3.source -> getter, setter
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void print(){                                                // 4.print생성
		System.out.printf("%s\t%.1f\t%.1f%d\t%.1f\t%s%n", name, height, weight, age, bmi, level);
	}
	
		
}
