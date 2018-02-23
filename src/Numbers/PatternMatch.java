package Numbers;
import java.util.*;
public class PatternMatch {
	public static void main (String [] args)
	{
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the pattern to be matched: ");
     String str =sc.next();
     StringBuffer str2= new StringBuffer(str);
     StringBuffer str3= str2.reverse();
     System.out.println("Reversed string is :"+str3);
	
	}

}
