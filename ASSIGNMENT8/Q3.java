import java.util.Scanner;
 class JavaProgram
{
   public static void main(String args[])
   {
       String strOrig, strNew;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       strOrig = scan.nextLine();
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
              
       System.out.print(strNew);
   }
}