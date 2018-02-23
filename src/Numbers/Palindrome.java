package Numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[])
	{
		System.out.println("Enter the number to be checked:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp;
		int sum=0;
		temp=n;
		while( temp>0)
		{
		
			sum=(sum*10)+(temp%10);
			temp=temp/10;
		}
		if (sum==n)
		{
			System.out.println(n + " Number is palindrome");
	
		}
		else 
		{
			System.out.println("It's not palindrome");
		}
	}
	
	
}
