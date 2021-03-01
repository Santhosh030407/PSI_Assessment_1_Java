import java.util.*;

//creating a class klarge for finding the k largest elements in the array.

public class klarge 
{
	
    public static void main(String args[]) 
    {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        int k = 3;
	System.out.println("Original Array: ");
	System.out.println(Arrays.toString(arr));
	System.out.println(k +" largest elements of the said array are:");

//this method helps to sort the given array in reverse order.

        Arrays.sort(arr, Collections.reverseOrder());   
      
          for (int i = 0; i < k; i++) 
          {
            System.out.print(arr[i] + " ");
          }
     }      
}
