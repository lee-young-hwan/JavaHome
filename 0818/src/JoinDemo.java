

public class JoinDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread() { // 익명 클래스
		@Override
		public void run() {
			try {
				Thread.sleep(10000);
			}catch(InterruptedException ex) {}
			System.out.println("Thread 끝");
		}
			
			
		};
		t1.start();
		try {
			//Thread.sleep(1000); // 1초
			t1.join(); // t1 스레드가 끝날 때까지  무작정 대기
		}catch(InterruptedException ex) {}
		System.out.println("메인 Thread 끝");
		
	}
}
