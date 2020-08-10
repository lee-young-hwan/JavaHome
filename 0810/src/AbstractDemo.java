

public class AbstractDemo { // Abstract = 미완성된 클래스
	public static void main(String[] args) {
		Lion lion = new Lion("Sally");
		lion.print();
		//Mammal m = new Mammal("Sally"); 
		Mammal m = new Lion("Sally");
		m.print();
	}
}
