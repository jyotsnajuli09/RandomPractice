package Numbers;

public class Mindtree {
	public static void main (String [] args)
	{
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the String:");
		String str1="Mindtree", str2="tdnimm";
		StringBuffer sb1= new StringBuffer(str2);
//		StringBuffer sb2= sb1.reverse();
		System.out.println("The Pattern is :"+str1.contains(sb1.reverse()));
	}

}
