package Numbers;

import java.util.Scanner;

public class reverseString {
    public static void main (String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string to be reversed: ");
    	String str1= sc.next();
    	StringBuilder sbr= new StringBuilder(str1);
    	System.out.print(sbr.reverse());
    }
}
