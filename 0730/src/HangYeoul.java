

public class HangYeoul {
public static void main(String[] args) {

	int [][] A = {{1,2},{3,4}};
	int [][] B = {{5,6},{7,8}};
	int [][] hap = new int[2][2];
	int [][] gop = new int[2][2];
	
	for (int i = 0; i < A.length; i++)
	{
		for (int j = 0; j < A[i].length; j++)
		{
			hap[i][j] = A[i][j] + B[i][j];
		}
	}
	
	
	for(int i = 0; i < A.length; i++)
	{
		for (int j = 0; j < A[i].length; j++)
		{
			for (int k = 0; k < 2; k++)
			{
				gop[i][j] += A[i][k] * B[k][j];
			}
		}
	}
	
	
	System.out.println("<<Çà·ÄÀÇ µ¡¼À>>");
	for (int i = 0; i < hap.length; i++)
	{
		for (int j =0; j < hap[i].length; j++)
		{
			System.out.print(hap[i][j] + "\t");
		}
		System.out.println();
	}
	
	
	System.out.println("<<Çà·ÄÀÇ °ö¼À>>");
	for (int i = 0; i < gop.length; i++)
	{
		for (int j =0; j < gop[i].length; j++)
		{
			System.out.print(gop[i][j] + "\t");
		}
		System.out.println();
	}
	
	
}
}
