

public class SwtichNestedEx {
	public static void main(String[] args) {
		
		int number = 7;
		
		switch(number) {
			case 1 : System.out.println();
			case 7 : System.out.println();
			
				switch(number) {
				
				case 1 : System.out.println("011이시군요"); break;
				
				case 7 : System.out.println("017이시군요"); break;
				}
				break;
				
			case 6 : System.out.println();
			case 9 : System.out.println();
				switch(number) {
				
				case 6 : System.out.println("016이시군요"); break;
				
				case 9 : System.out.println("019이시군요"); break;
				}
				break;
				
		}
		
	}
}
