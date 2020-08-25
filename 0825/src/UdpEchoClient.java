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
			// Client�� ������ ��Ʈ��ȣ ���� -> ������ ��Ʈ�� �������� ����ϰڴٴ� ��
		}catch(SocketException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			System.out.println("�������� ������ �޼����� �Է��ϼ���. �׸��Ͻ÷��� /quit�� ��������.");
			while(true) {
				System.out.println(">>");
				String message = this.scan.nextLine(); 
				
				
				byte [] sendBuffer = message.getBytes();
				this.sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName("DESKTOP-IUVI60V"), 9999);
						this.client.send(sendPacket); //�߼�
						
						if (message.equals("/quit")) break;
						
				byte[] buffer = new byte[512];
				this.receivePacket = new DatagramPacket(buffer, buffer.length);
				this.client.receive(receivePacket);  // ����
				
				System.out.println(new String(buffer, 0, this.receivePacket.getLength()));
			}
		}catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		new UdpEchoClient().service();
	}
}
