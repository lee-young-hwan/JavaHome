import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Apache {
	private ServerSocket server;
	public Apache() {
		
		try {
			this.server = new ServerSocket(80);
			System.out.println("Server is ready.");
		} catch(IOException ex) {}
			
		}
		
		private void service() {
			try {
			while(true) {
				
				Socket client = this.server.accept();
				ServerThread st = new ServerThread(this); 
				st.start();
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
	
	public static void main(String[] args) {
		//new Apache().service();
		Apache apache = new Apache();
		apache.service();
	}
}
