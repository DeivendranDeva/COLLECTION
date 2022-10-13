package october;
import java.util.*;
import java.util.LinkedList;

public class Collection_Demo1 
{
    public static void main(String[] args) 
	{
      LinkedList firstlist = new LinkedList();
      
      firstlist.add("Deva");
      firstlist.add(0, 14.00);
      firstlist.add(34);
    
      
      System.out.println(firstlist);
      System.out.println(firstlist.lastIndexOf(34));
      System.out.println(firstlist.peekFirst());
      System.out.println(firstlist.peekLast());
            
	}

}
