import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		/*Vector<String> vector = new Vector<String>(1,1);
		Scanner scan = new Scanner(System.in);
		String y_n = null;
		
		do {
			System.out.print("Enter a string >> : ");
			String line = scan.nextLine();
			vector.add(line);
			
			System.out.print("Again(y/n) ? : ");
			y_n = scan.nextLine();
		}while(y_n.toUpperCase().equals("Y"));
		System.out.println("입력받은 문장의 갯수 : " + vector.size());*/
		
		Vector<Car> vector = new Vector<Car>(1,1);
		vector.add(new Car("Red Sonata", 25_000_000));
		vector.add(new Car("Blue Carnival", 28_000_000));
		vector.add(new Car("Black Matiz", 10_000_000));
		
		for (int i = 0; i <vector.size() - 1; i++){
			for (int j = 0; j < vector.size() - 1; j++) {
				if (vector.get(j).getPrice() < vector.get(j+1).getPrice()) {
					//swapping
					Car temp = vector.elementAt(j);
					vector.setElementAt(vector.elementAt(j+1),j);  // array[j+1] = array[j};
					vector.setElementAt(temp, j+1);                // array[j+1] = temp;
				}
			}
		}
		for (Car c : vector) System.out.println(c);
	}
}