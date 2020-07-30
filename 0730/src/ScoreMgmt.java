import java.util.Arrays;

public class ScoreMgmt {
public static void main(String[] args) {
	
	int [] answers = {1,2,3,4,1,2,3,4,1,2}; // 정답배열
	int [][]array = {{1, 2, 2, 4, 2, 2, 3, 4, 1, 2},
			 {1,2,3,4,1,1,1,4,1,1},
			 {1,2,3,4,1,2,3,4,1,2},
			 {1,3,3,3,3,3,3,3,1,2},
			 {1,2,3,4,1,2,3,1,1,2}};        // 학생 답안지 배열
	
	char [][] results = new char[5][11];
	
	
	System.out.println("[정답]");
	System.out.println(Arrays.toString(answers));
	
	System.out.println("\n[학생들 제출 답안]");
	
	for (int i = 0; i < array.length; i++)
	{
		System.out.print("학생" + (i+1) + " : ");
		
		for (int j = 0; j < array[i].length; j++)
		{
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
	
	//채점
	
	for (int i = 0; i < array.length; i++)
	{
		for ( int j = 0; j < array[i].length; j++)
		{
			if(array[i][j] == answers[j])
			{
				results[i][j] = 'O';
				results[i][10] += (char)10;
			}
			else
			{
				results[i][j] = 'X';
			}
		}
	}
		System.out.println("\n[채점 결과]");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("학생" + (i+1) + " : ");
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print(results[i][j] + " ");       // o x o x o x o x o x
			}
			System.out.println("(" + (int)results[i][10] + "점)");
		}
			
}
}
