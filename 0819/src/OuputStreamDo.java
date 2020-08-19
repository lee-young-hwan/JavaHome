import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OuputStreamDo {
	public static void main(String[] args) {
		// InputStream is = System.in;
		OutputStream os = System.out;
		String str = "æ»≥Á«œººø‰.";

		try {
			// os.write(65); os.write(66); os.write(67); os.write(68); os.write(69);
			byte[] buffer = str.getBytes();
			os.write(buffer);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//byte [] buffer = str.getBytes();
		//for (byte b : buffer) System.out.print(b);
	}

}
