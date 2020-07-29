
import java.util.Scanner;

public class ArrayDemo5 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String [] array = {"예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능", "예약가능"};
	int count = 0;

	while(true)
	{
		System.out.print("> 좌석을 예약하시겠습니까? (예 -1 아니오-0) :");
		int result = scan.nextInt();
		
		if (result == 1)
		{
			System.out.println("현재 좌석 상태");
			for (int i = 0; i < array.length;i++)
		{
				System.out.printf("[%d]%-10s", (i + 1), array[i]);
			
			
			if ((i+1)==5) System.out.println();
		}
			System.out.println();
			System.out.print("몇 번째 좌석을 예약하시겠습니까? :");
			int seatNo = scan.nextInt();
			
			if (seatNo > array.length) System.out.println("잘못된 좌석번호입니다.");
			else if (array[seatNo - 1].equals("예약됨")) System.out.println("이미 예약된 좌석입니다.");
			else 
		{
				array[seatNo-1]="예약됨";
				System.out.println(seatNo + "번째 좌석이 예약되어있습니다");
				count++;
				if (count == 10)
				{
					System.out.println("모든 좌석의 예약이 마감되었습니다.");
					return;
				}
		}
			
		}
		else
		{
			System.out.println("Program is over..");
			return; // break = 반복문이나 switch를 벗어난다는 뜻    return = main을 끝냄
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 좌석문제 연습
	Scanner scan = new Scanner(System.in);
	String [] array = {"예약가능","예약가능","예약가능","예약가능","예약가능","예약가능","예약가능","예약가능","예약가능","예약가능"};
	int younghwa = 0;
	
	while(true)
	{
		System.out.print("좌석을 예약하시겠습니까?\n");
		
		for (int i = 0; i <array.length; i++)
		{
			System.out.printf("[%d]%s", i+1, array[i]);
		}

		System.out.print("몇 번째 좌석을 예약하시겠습니까?");
		
		younghwa = scan.nextInt();
		
	}*/
	
	
	
}
}
