/*
작성자 : 내 이름
작성목적 : ~~하는 프로그램
작성일시 : 언제 코딩을 했는지
작성환경 : OS, Java의 버전, 어떤 Edit에서 했는지
*/

public class LabelBreakContinueDemo{
	public static void main(String[] args) {

		/*outer :  // Label (세미콜론이 아니고 콜론 : )
		for (int i =1 ; i <= 100 ;i++)          // 바깥쪽을 벗어나려고 할때 Label(outer)을 사용
		{
			inner : // Label (세미콜론이 아니고 콜론 :)
			for (int j = 65 ; j <= 90 ;j++)
			{
				if (i == 10)
				{
					break outer; // break : inner만 벗어난다
					             // break outer : inner와 outer를 모두 벗어난다
				}
			}
		}*/




		   // for문에 Loop1이라는 이름을 붙였다.
		outer :  // Label이라고 한다
			for(int i=2;i <=9;i++) {	
				for(int j=1;j <=9;j++) {
					if( j==5 )
						//break outer;  // i를 벗어났기 때문에 3단이 나오지 않는다
//						break;
//						continue Loop1;

						//continue;  // j = 5인 값을 건너뛴다
						continue outer;
					System.out.print(i + "*" + j + "=" + i*j + "   ");
				} // end of for i
				System.out.println();
		} // end of Loop1


	}
}