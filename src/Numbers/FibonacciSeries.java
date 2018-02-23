package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the count for which fibonacci series has to be generated:");
		int num1=0,num2=0,sum;
		for (int i=1;i<=num;i++)
		{
			System.out.print(num1+"");
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
	}

}
