 
import java.util.Arrays;

public class StudentDapAn {
public static void main(String[] args) {
	
	int[] answer = {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
	
	int[][] student = new int[5][10];
	
	student[0] = new int[] {1, 2, 2, 4, 2, 2, 3, 4, 1, 2};
	student[1] = new int[] {1, 2, 3, 4, 1, 1, 1, 4, 1, 1};
	student[2] = new int[] {1, 2, 3, 4, 1, 2, 3, 4, 1, 2};
	student[3] = new int[] {1, 3, 3, 3, 3, 3, 3, 3, 1, 2};
	student[4] = new int[] {1, 2, 3, 4, 1, 2, 3, 1, 1, 2};
	
	System.out.println("채점 결과");
	
	int score = 0;
	int count = 0;
	
	for (int[] std : student)
	{
		score = 0;
		count += 1;
		System.out.printf("학생%d : ", count);
		
		for(int j = 0; j < std.length; j++)
		{
			if (std[j] == answer[j])
			{
				System.out.print("0 ");
				score += 10;
		    }
			else 
				System.out.print("X ");
		}	
			System.out.printf("(%d점)\n", score);
	}
	
}
}


