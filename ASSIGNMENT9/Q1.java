import java.io.File; 
import java.util.Scanner; 
class Print
{ 
  public static void main(String[] args) throws Exception 
  {  
    File file = new File("C:\\Users\\hp\\Desktop\\abc.txt"); 
    Scanner sc = new Scanner(file); 
  
    while (sc.hasNextLine()) 
      System.out.println(sc.nextLine()); 
  } 
}