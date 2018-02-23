package Numbers;

import java.util.Scanner;

public class OddEven {

public static void main (String []args)
{
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	if(a%2 == 0)
	{
	System.out.println("It's EVEN");
	}
	System.out.println("It's ODD");
    
}
}
