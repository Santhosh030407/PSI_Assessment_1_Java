import java.util.Scanner; 

//creating a class Equal to verify whether given four numbers are equal or not.

public class Equal
{
	public static void main(String args[]) 
      {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input third number: ");
        int num3 = sc.nextInt();
        System.out.print("Input fourth number: ");
        int num4 = sc.nextInt();		
		
//this if loop checks whether the four numbers are equal or not.

		if (num1 == num2 && num2 == num3 && num3 == num4) 
		  {
			System.out.println("Numbers are equal.");
                  }
		else
                  {
			System.out.println("Numbers are not equal!");
		  }
	}
}

