

public class SwtichNestedEx {
	public static void main(String[] args) {
		
		int number = 9;
		
		
		// ����ȭ�� ��, ������ �ִ� ������ switch���� �������� ����
		switch(number) {
		case 1 :
		case 7 :
				switch(number) {
				case 1 : System.out.println("011�̽ñ���"); 
				break;
				
				case 7 : System.out.println("017�̽ñ���");
				break;
				}
				break;
				
		case 6 :
		case 9 :
			if (number == 6) {
				System.out.println("016�̽ñ���");
			}
			
			else if(number ==9)
				System.out.println("019�̽ñ���");
			break;
		}
		
	}
}
