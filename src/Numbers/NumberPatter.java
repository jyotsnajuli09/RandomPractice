package Numbers;

public class NumberPatter {
 public static void main(String [] args)
 {
	 int num=4;
	 for(int i=0;i<=num;i++)
	 {
		for(int j=2;j>=i;j--)
		{
		 System.out.print(num);
		 
		}
		System.out.println();
		num--;
	 }

 }
}