import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a hose name : ");

		String hostname = scan.next();

		try {
			//InetAddress ia = InetAddress.getByName(hostname);         // getByName : (IP를 1개만 사용)
			InetAddress [] array = InetAddress.getAllByName(hostname);  // getAllByName :(IP를 여러개 사용), 배열 InetAddress 
			
			for (InetAddress ia : array) { 
				
				System.out.println(hostname + " > " + ia.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}
}
