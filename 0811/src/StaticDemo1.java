

public class StaticDemo1 {
	private static int count; //= getCount();
    static {
    	System.out.println("���� ����ƽ ���");
    	count = 100;
    }
	
//	private static int getCount(){
//		System.out.println("���� ����ƽ �޼ҵ�");
//		return 100;
//	}
	
	public static void main(String[] args) {
		System.out.println("���� ���� �޼ҵ�");
		System.out.println("count = " + count);
	}
}
