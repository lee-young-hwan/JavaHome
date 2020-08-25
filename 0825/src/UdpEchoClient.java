import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpEchoClient {
	private DatagramSocket client;
	private DatagramPacket sendPacket, receivePacket;
	private Scanner scan;
	
	public UdpEchoClient() {
		
		try {
			this.client = new DatagramSocket();
			this.scan = new Scanner(System.in);
			// Client용 소켓은 포트번호 없음 -> 가용한 포트를 랜덤으로 사용하겠다는 뜻
		}catch(SocketException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			System.out.println("서버에게 보내실 메세지를 입력하세요. 그만하시려면 /quit를 넣으세요.");
			while(true) {
				System.out.println(">>");
				String message = this.scan.nextLine(); 
				
				
				byte [] sendBuffer = message.getBytes();
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName("DESKTOP-IUVI60V"), 9999);
						this.client.send(sendPacket); //발송
						
						if (message.equals("/quit")) break;
						
				byte[] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);
				this.client.receive(receivePacket);  // 수신
				
				System.out.println(new String(buffer, 0, this.receivePacket.getLength()));
			}
		}catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoClient().service();
	}
}
