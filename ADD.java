import java.util.Scanner;
class UserInput
{
	public static void main(String args[])
   {
   int a,b,sum;
   System.out.println("Enter First number");
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   System.out.println("Enter Second number");
   b=sc.nextInt();
   sum=a+b;
   System.out.println("SUM = " + sum);
   }
}