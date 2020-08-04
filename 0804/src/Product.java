

public class Product {
	String name;
	int price;
	void copy(Product other){  // 값복사
		other.name = this.name;
		other.price = this.price;
	}
	
	Product copy1(){ // 주소복사
		System.out.println("볼펜의 주소 = " + this);
		return this;
	}
}
