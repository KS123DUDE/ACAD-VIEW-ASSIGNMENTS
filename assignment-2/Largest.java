import java.util.Scanner; 
class Largest 
{
public static void main(String[] args) 
{
   int n1,n2,n3;
  Scanner sc= new Scanner(System.in);
   System.out.print("Input the 1st number: ");
   n1 = sc.nextInt();
   System.out.print("Input the 2nd number: ");
   n2 = sc.nextInt();
   System.out.print("Input the 3rd number: ");
   n3 = sc.nextInt();
   if( n1 >= n2 && n1 >= n3)
   System.out.println(n1 + " is the largest number.");
 else if (n2 >= n1 && n2 >= n3)
System.out.println(n2 + " is the largest number.");
else
System.out.println(n3 + " is the largest number.");
    }
}