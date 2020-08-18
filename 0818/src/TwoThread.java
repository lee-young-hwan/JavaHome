

public class TwoThread extends Thread{
	public static void main(String[] args) {
		
		TwoThread tt = new TwoThread();
		tt.start();//tt.run();
		
		for (int i = 0; i < 10; i++) 
			System.out.println(Thread.currentThread().getName() + "->" + i);
		
		
	}
	
	@Override
	public void run() {  // 재정의가 필요하기 때문에 반드시 Public 사용(@Override)
		for (int i = 0; i < 10; i++)
		System.out.println(Thread.currentThread().getName() + "->" + i);
	}
	
}
