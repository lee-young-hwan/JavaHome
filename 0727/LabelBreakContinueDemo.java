/*
�ۼ��� : �� �̸�
�ۼ����� : ~~�ϴ� ���α׷�
�ۼ��Ͻ� : ���� �ڵ��� �ߴ���
�ۼ�ȯ�� : OS, Java�� ����, � Edit���� �ߴ���
*/

public class LabelBreakContinueDemo{
	public static void main(String[] args) {

		/*outer :  // Label (�����ݷ��� �ƴϰ� �ݷ� : )
		for (int i =1 ; i <= 100 ;i++)          // �ٱ����� ������� �Ҷ� Label(outer)�� ���
		{
			inner : // Label (�����ݷ��� �ƴϰ� �ݷ� :)
			for (int j = 65 ; j <= 90 ;j++)
			{
				if (i == 10)
				{
					break outer; // break : inner�� �����
					             // break outer : inner�� outer�� ��� �����
				}
			}
		}*/




		   // for���� Loop1�̶�� �̸��� �ٿ���.
		outer :  // Label�̶�� �Ѵ�
			for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if( j==5 )
						//break outer;  // i�� ����� ������ 3���� ������ �ʴ´�
//						break;
//						continue Loop1;

						//continue;  // j = 5�� ���� �ǳʶڴ�
						continue outer;
					System.out.print(i + "*" + j + "=" + i*j + "   ");
				} // end of for i
				System.out.println();
		} // end of Loop1


	}
}