

public class AbstractDemo { // Abstract = �̿ϼ��� Ŭ����
	public static void main(String[] args) {
		Lion lion = new Lion("Sally");
		lion.print();
		//Mammal m = new Mammal("Sally"); 
		Mammal m = new Lion("Sally");
		m.print();
	}
}
