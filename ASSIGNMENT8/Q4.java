
import java.util.Scanner;

class A4
{
	public static void main(String[] x)
	{
		String str,substr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		str = sc.nextLine();
		
		System.out.print("Enter string to search: ");
		substr = sc.nextLine();
		
		int l1 = str.length();
		int l2 = substr.length();
		int limit = l1 - l2;
		boolean found = false;
		
		for(int i=0;i<=limit;i++)
		{
			String txt = str.substring(i,i+l2);
			if(txt.equals(substr))
			{
				System.out.println("Found '" + txt + "' at pos = " + i);
				found = true;
			}
		}
		if(found == false)
			System.out.println("\nNot found.");
		
		sc.close();
	}
}