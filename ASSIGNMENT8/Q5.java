import java.util.Scanner;

class A5
{
	public static void main(String[] args)
	{
		String line;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		line = sc.nextLine();
		if(line.length() == 0)
			count = 0;
		else
		{
			for(int i=0;i<line.length()-1;i++)
			{
				if(line.charAt(i) == ' ' && line.charAt(i+1) != ' ')
				{
					count++;
				}
			}
		}
		System.out.println("\nThe number of words : " + count);
		
		sc.close();
	}
}