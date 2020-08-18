

public class DaemonThreadDemo implements Runnable{
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThreadDemo(), "Demo");
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(10000); // 10��
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		//t.interrupt();
		System.out.println("main Thread�� ����ƽ��ϴ�");
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("���� Daemon Thread�� ���� ���Դϴ�");
			try {
				Thread.sleep(500); // 0.5��
			} catch(InterruptedException ex) {
				break;
			}
		}
		System.out.println("������ Daemon Thread�� ����ƽ��ϴ�");
	}
}
