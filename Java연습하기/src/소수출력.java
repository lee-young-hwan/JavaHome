public class �Ҽ���� {
	public static void main(String[] args) {

		int count = 0; // count : ����� ����
		
		for (int i =2; i <=100; i++) {
			for (int j =2; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
			if (count == 1) {
				System.out.println(i + "�� �Ҽ�");
			}
			count = 0;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count=0;
//		for(int i=2; i<=100; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
//		{
//			for(int j=2; j<=i; j++)
//			{
//				if(i%j ==0) 
//				{
//					count ++;
//				}    
//			}
//
//			// �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
//			if(count==1)
//			{
//				System.out.print(i+" ");
//			}
//			count=0;
//		}

	}
}