public class NioDemo {
	public static void main(String[] args) {
		FileChannelDemo2.start();
		try{
			FileChannelDemo2.copy("C:/temp/demo.zip", 
				                    "C:/temp/fileChannelDemo2.zip");
		}catch(java.io.IOException ex){}
		FileChannelDemo2.end();
		long difference = FileChannelDemo2.during();
		System.out.println("���翡 �ɸ� �ð��� " + difference + " ms");
	}
} 