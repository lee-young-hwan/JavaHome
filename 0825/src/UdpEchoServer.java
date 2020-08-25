import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpEchoServer {
	private DatagramSocket server;
	private DatagramPacket sendPacket, receivePacket;

	public UdpEchoServer() {
		try {
			this.server = new DatagramSocket(9999);
			System.out.println("server is ready.");
		} catch (SocketException e) {
			System.out.println(e);
		}
	}
	
	private void service() {
		try {
			
			while(true) {
			
				byte[] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);
				this.server.receive(receivePacket);
				String message = new String(buffer, 0, this.receivePacket.getLength());
				
				if(message.equals("/quit")) break; 
				
				InetAddress clientAddress = this.receivePacket.getAddress();
				int clientPort = this.receivePacket.getPort();
				System.out.println("[" + clientAddress.getHostAddress() + "]" + message);
				byte [] sendBuffer = ("From Server : " + message).getBytes();
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);
				this.server.send(sendPacket);        // ¹ß¼Û
				
			}
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new UdpEchoServer().service();
	}
}
