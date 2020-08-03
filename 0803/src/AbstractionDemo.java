

public class AbstractionDemo {
public static void main(String[] args) {
	Car sonata; // 선언
	sonata = new Car(); // 234쪽 2.4
	sonata.name = "소나타";
	sonata.maker = "현대자동차";
	sonata.color = "Sliver";
	sonata.price = 25_000_000;
	sonata.print();
	
	Car carnival = new Car();
	carnival.name = "카니발";
	carnival.maker = "기아자동차";
	carnival.color = "Black";
	carnival.price = 35_000_000;
	carnival.print();
}
}
