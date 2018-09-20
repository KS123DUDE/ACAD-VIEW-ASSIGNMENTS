import java.util.*;
class Mapping
{
    public static void main(String []args)
  {
    int a;
    HashMap hm=new HashMap();
    hm.put("Kshitij",1);
    hm.put("Harry",2);
    hm.put("Dheeraj",3);
    hm.put("Manish",4);
    hm.put("Honey",5);
    Set set=hm.entrySet();
    Iterator it=set.iterator();
    System.out.println("elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());

    }

  }
}