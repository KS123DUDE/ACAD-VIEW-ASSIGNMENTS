public class Overloade
{

    static void print()
    {
        System.out.println("Hello !!");
    }

    static void print(int a)
    {
               System.out.println("Hello !!"+a);
    }

    static void print(float a)
    {
               System.out.println("Hello !!"+a);
    }




    public static void main(String args[])
    {

        int a=1;
        float b=1F;

        Overloade.print();
          Overloade.print(b);
            Overloade.print(a);

    }



}
