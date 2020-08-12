
//Unchecked Exception
public class EnglishException extends RuntimeException { // try ~ catch를 쓰지 않아도 된다(unchecked)  
	public EnglishException(String message) {
		super(message);
	}
}
