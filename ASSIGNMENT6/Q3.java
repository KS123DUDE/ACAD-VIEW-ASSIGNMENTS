import java.util.Scanner;
class Max 
{
Scanner sc=new Scanner(System.in);

String a1=sc.next();
String a2=sc.next();
void compare() 
{
	if(Integer.parseInt(a1)>Integer.parseInt(a2)) 
	{
		System.out.println(" A1 Value is Bigger");
	}
	else 
	{
		System.out.println(" A2 Value is Bigger");
	}
}
	public static void main(String[] args) 
	{
Max n=new Max();
	n.compare();
	}
}