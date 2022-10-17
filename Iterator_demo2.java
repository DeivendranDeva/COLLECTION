package october;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator_demo2 {

	public static void main(String[] args)
	{
      List <Integer> mylist = new ArrayList();
      
      mylist.add(12);
      mylist.add(67);
      mylist.add(14);
      mylist.add(56);
      mylist.add(12);
      mylist.add(82);
      mylist.add(12);
      mylist.add(44);
      mylist.add(12);
      
      System.out.println("With Duplicate :"+mylist);
      
      ListIterator <Integer> it = mylist.listIterator();
      while(it.hasNext())
      {
    	 int i = it.nextIndex();
    	 Integer current =it.next();
    	 
    	 for(int j=0 ; j<i ; j++)
    	 {
    		 if(current.equals(mylist.get(j)))
    		 {
    			 it.remove();
    			 break;
    		 }
    	 }
      }
      System.out.println("Without Duplicate :"+mylist);
      
	}

}
