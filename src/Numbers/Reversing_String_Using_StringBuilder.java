package Numbers;
import java.util.Scanner;

public class Reversing_String_Using_StringBuilder
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter th string");
		String str1=sc.next();
		char[] input=str1.toCharArray();
		int len=input.length;
		int in=0;
		char[] output = new char[len];
		for (int i=len-1;i>=0;i--)
		{
			output[in]=input[i];
			System.out.print(output[in]);
			in++;	
		}
		
	}
}