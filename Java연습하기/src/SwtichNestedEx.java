

public class SwtichNestedEx {
	public static void main(String[] args) {
		
		int number = 7;
		
		switch(number) {
			case 1 : System.out.println();
			case 7 : System.out.println();
			
				switch(number) {
				
				case 1 : System.out.println("011�̽ñ���"); break;
				
				case 7 : System.out.println("017�̽ñ���"); break;
				}
				break;
				
			case 6 : System.out.println();
			case 9 : System.out.println();
				switch(number) {
				
				case 6 : System.out.println("016�̽ñ���"); break;
				
				case 9 : System.out.println("019�̽ñ���"); break;
				}
				break;
				
		}
		
	}
}
