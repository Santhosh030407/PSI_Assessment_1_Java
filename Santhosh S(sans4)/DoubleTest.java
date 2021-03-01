import java.util.Scanner;

//creating a class DoubleTest to verify whether the no. is between 0 to 1.

public class DoubleTest
{
	public static void main(String args[]) 
       {
	Scanner sc = new Scanner(System.in);
	System.out.print("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second number: ");
        double num2 = sc.nextDouble();
        System.out.println(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1);
       }
}
