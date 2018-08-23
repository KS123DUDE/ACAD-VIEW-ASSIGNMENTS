import java.util.Scanner;
class Rectangle
 {
  int length;
  int breadth;

  public int CalculateArea()
  {
      int l,b;
      l=this.length;
      b=this.breadth;
      return l*b;
  }

  public static void main(String[] args)
  {
      Rectangle a1=new Rectangle();
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter length");
       a1.length=sc.nextInt();
       System.out.println("Enter breadth");
       a1.breadth=sc.nextInt();

     System.out.println("Area is "+a1.CalculateArea());
  }
}
