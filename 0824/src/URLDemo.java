import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 * 1. URL�� �˻��ؼ� MalformedURLException ���� �Ǵ�
 * 2. Stream ����
 * 3. URLConnection ��ü ����
 */

public class URLDemo {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		
		String urlStr = scan.next();
		URL url = null;
		
		try {
			 url = new URL(urlStr);
			 System.out.println("Protocol : " + url.getProtocol());
			 System.out.println("Host : " + url.getHost());
			 System.out.println("Port : " + url.getPort());
			 System.out.println("Default port : " + url.getDefaultPort());
			 System.out.println("File : " + url.getFile());
			 System.out.println("QueryString : " + url.getQuery());
			 System.out.println("Reference : " + url.getRef());
			 System.out.println("Path : " + url.getPath());
		} catch(MalformedURLException e) {
			System.out.println("�߸��� URL�Դϴ�.");
		}
	}
	
}