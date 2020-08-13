

public class GenericDemo {
	public static void main(String[] args) {
		Demo <Integer>d = new Demo <Integer>(10);
		int su = d.getCount();
		d.setCount(100);
		
		Demo<Double> d1 = new Demo<Double>(89.5);
		double avg = d1.getCount();
		d1.setCount(90.5);
		
		//Demo<String> d2 = new Demo<String>("Hello");
		//String str = d2.getCount();
		//d2.setCount("World");
		
	}
}

class Demo <T extends Number>{
	private T count; // private Integer.count = new Integer(10);
	public Demo(T count) {
		this.count = count;
	}
	
	public T getCount() { // count.intValue();
		return this.count;
	}
	
	public void setCount(T Count) {
		this.count = count;
	}
}
