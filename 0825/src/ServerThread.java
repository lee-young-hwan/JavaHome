import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;

	public ServerThread(Socket client) {
		try {
			this.client = client;
			this.br = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
			this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.client.getOutputStream())));
		} catch (IOException ex) {
		}
	}
	
	@Override
	public void run() { // OS가 스케줄러에 의해서 사용할 코드
		try {
			String line = this.br.readLine();
			//System.out.println(line);  // GET / HTTP/1.1
			int start = line.indexOf(" ") + 1; // 4번째
			int end = line.indexOf("Http") - 1;  // 5번째
			String filename = line.substring(start, end);
			//System.out.println(filename);
			if (filename.startsWith("/") && filename.length() == 1) filename = "index.html";
			send(filename);
			
			
		} catch (IOException ex) {
			System.out.println(ex); 
		}
	}
	
	private void send(String filename) throws IOException{
		File file = new File("D:/WebHome/" + filename);
		String line = null; 
		
		this.br = new BufferedReader(new FileReader(file));
		
		while((line = this.br.readLine())!=null) {
			this.pw.println(line);
			this.pw.flush();
			
		}
	}
}
