import java.util.*;

//creating a class ChangeRW which gets the input 2D array and transposes it.

public class ChangeRW 
{
	public static void main(String[] args) 
       {
		int[][] twod = {
				{10, 20, 30},
				{40, 50, 60}
		};
		System.out.print("Original Array:\n");
		print_arr(twod);
		System.out.println("After changing the rows and columns of the said array:");
		transpose(twod);
	}
	
//transpose method is used for changing the rows and columns of the 2D array.

	private static void transpose(int[][] twod)
       {
		
		int[][] newtwod = new int[twod[0].length][twod.length];
		
		for (int i = 0; i < twod.length; i++) 
                {
			for (int j = 0; j < twod[0].length; j++) 
                        {
				newtwod[j][i] = twod[i][j];
			}
		}
		
		print_arr(newtwod);
	}

//print_arr function is used for printing the 2D array.

	private static void print_arr(int[][] twod) 
        {
		for (int i = 0; i < twod.length; i++) 
                {
			for (int j = 0; j < twod[0].length; j++) 
                        {
				System.out.print(twod[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
