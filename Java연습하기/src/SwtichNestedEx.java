

public class SwtichNestedEx {
	public static void main(String[] args) {
		
		int number = 9;
		
		
		// 정형화된 값, 정해져 있는 값들은 switch문이 가독성이 좋다
		switch(number) {
		case 1 :
		case 7 :
				switch(number) {
				case 1 : System.out.println("011이시군요"); 
				break;
				
				case 7 : System.out.println("017이시군요");
				break;
				}
				break;
				
		case 6 :
		case 9 :
			if (number == 6) {
				System.out.println("016이시군요");
			}
			
			else if(number ==9)
				System.out.println("019이시군요");
			break;
		}
		
	}
}
