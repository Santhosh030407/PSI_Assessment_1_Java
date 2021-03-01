import java.util.*;

//creating a class Truefalse for printing the 2D array.

public class Truefalse 
{
	public static void main(String args[]) 
       {
		boolean[][] arr = {{true, false, true},{false, true, false}};

//calculating the length of rows and columns.

		int rlen = arr.length;
		int clen = arr[0].length;
		 
//creating for loop for getting the values of rows and columns and to display the output.

		for (int i = 0; i < rlen; i++) 
                {
			for (int j = 0; j < clen; j++) 
                        {
				
				if (arr[i][j]) 
                                {
					System.out.print(" t ");
				} 
                                else 
                                {
					System.out.print(" f ");
				}
				
			}
			System.out.println();
	        }	
     }
}
