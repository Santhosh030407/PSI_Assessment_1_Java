import java.util.Scanner;

//creating a binary class to count the no. of zeros in the binary representation of the number.

public class binary 
{	

//countzeros method counts the no. of bits which is equal to zero, after converting the number to binary.

    public static int countzeros(int n) 
   {
     int res = 0;
     String binaryNum = Integer.toBinaryString(n);
     System.out.print("Binary representation of "+n+" is: "+binaryNum);
       for (char ch : binaryNum.toCharArray()) 
       {
         res += ch == '0' ? 1 : 0;
       }
     return res;
   }	
	
//main function gets the input number and performs the operation.

   public static void main(String[] args) 
   {
	Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int n = sc.nextInt();
	System.out.println("\nNumber of zero bits: " + countzeros(n));
   }
}
