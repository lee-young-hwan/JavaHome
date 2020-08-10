

public class Student implements Comparable<Student>{
	private String name;
	private int tot;
	private double avg;
	
	public Student(String name, int tot, double avg) {
		this.name = name;
		this.tot = tot;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", tot=" + tot + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(Student o) {
		//return this.tot - o.tot;
		//return this.name.compareTo(s.name);
		return (int)(this.avg-o.avg);
	}
	
}
