

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		// Sonata [] array = new Sonata[2];
		//// Heterogeneous Collection
		//Car [] array = new Car[3];
		//array[0] = new Sonata("Black Sonata");
		//array[1] = new Matiz("Silver Matiz");
		//array[2] = new Carnival("White Carnival");
		
		/*Car [] array = {new Sonata("Black Sonata"), new Matiz("Silver Matiz"), new Carnival("White Carnival")};
		
		for( Car car : array ) System.out.println(car);    // car.toString
		
		Mammal [] array1 = new Mammal[4];
		array1[0] = new Dog();
		array1[1] = new Cat();
		array1[2] = new Korean();
		array1[3] = new American();*/
		
		Object [] array = new Object[3];
		array[0] = new String("Hello");
		array[1] = new Sonata("Black Sonata");
		array[2] = new Dog();
	}
}
