import java.util.Arrays;

public class ArrayDemo3 {
public static void main(String[] args) {
	
	  //int [][] array = {{3,4,5}, {6,7,8}};    // rectanguler array
	  
	  int[][] array = new int[3][];
	  array[0] = new int[] {3,4,5,6,7};
	  array[1] = new int[] {8,9}; 
	  array[2] = new int[] {10,11,12,13};
	  
//	  // System.out.println(array.length);    // 행의 길이 
//	  // System.out.println(array[0].length); // 열의 길이
//	  
//	  for (int i = 0; i < array.length; i++)
//	  {
//		  for(int j = 0; j < array[i].length; j++)
//		  {
//			  System.out.printf("array[%d][%d] = %d\t\t", i, j, array[i][j]); 
//		  }
//		  System.out.println();
//	  }
	   
	   
	  
	/*int [][][] array = new int[3][4][5];
	System.out.println(array.length);        // 3 (제일 앞의 수)
	System.out.println(array[0].length);     // 4
	System.out.println(array[0][0].length);  // 5*/
	 
//	  for (int [] array1 : array) // int [] array1 = array[0], array1 = array[1]
//	  {
//		  for (int su : array1)
//		  {
//			  System.out.print(su+ "\t\t");
//		  }
//		  System.out.println();
//	  }
//	      System.out.print(Arrays.toString(array1));
//		  System.out.println();
//	  }
	  
	 
	}
}
