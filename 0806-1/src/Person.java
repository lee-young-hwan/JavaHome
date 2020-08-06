

public class Person {
	private String name;
	private String address;
	private String tell;
	
	public Person(String name, String address, String tell) {
		this.name = name;
		this.address = address;
		this.tell = tell;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", tell=" + tell + "]";
	}
	
	
	
}
