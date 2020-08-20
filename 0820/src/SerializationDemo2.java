import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Vector;

public class SerializationDemo2 {
public static void main(String[] args) { 
	Vector<Car> vector = new Vector<Car>(3);
	vector.addElement(new Car("Sonata", 25_000_000, "Hyundai"));
	vector.addElement(new Car("Carnival", 35_000_000, "KIA"));
	vector.addElement(new Car("Matiz", 10_000_000, "DAEWOO"));
	
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/temp/mydate.ser")))){
		oos.writeObject(vector); // 5:12
		System.out.println("Save Success");
		}catch(IOException ex) {
			System.out.println("직렬화 실패");
		} 
}
}
