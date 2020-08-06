

public class Customer extends Person {
	private String customtell;
	private int mileage;
	
	

	public Customer(String name, String address, String tell, String customtell, int mileage) {
		super(name, address, tell);
		this.customtell = customtell;
		this.mileage = mileage;
	}

	public String getCustomtell() {
		return customtell;
	}

	public void setCustomtell(String customtell) {
		this.customtell = customtell;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
}
