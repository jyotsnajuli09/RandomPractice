package Numbers;

public class Mindtree {
	public static void main (String [] args)
	{
		String str1="Mindtree",str2="tdnii";
		StringBuffer sbr1=new StringBuffer(str2);
		if(str1.contains(sbr1.reverse()))
				{
			System.out.println("Pattern is matching");
				}
		else
		{
			System.out.println("It's not matching");
		}
	}
}
