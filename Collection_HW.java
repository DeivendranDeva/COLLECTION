package october;

import java.util.ArrayList;
import java.util.List;

public class Collection_HW {

	public static void main(String[] args) 
	{
      List l = new ArrayList();
      
      l.add("rice");
      l.add(null);
      l.add(12);
      l.add(null);
      l.add(false);
      
      for(Object obj:l)           //1
      {
       System.out.println(obj);
      }
       System.out.println();
      
      for(Object obj:l)           //2
      {
    	 try 
    	 {
    	 if(obj==(null)) 
    	    obj="newone";
    	 }
    	 catch(Exception e)
    	 {
          System.out.println(obj);
    	 }
    	  System.out.println(obj);  	 
      }
      System.out.println();
      
      

      for(Object obj:l)            //3
      {
    	 try
    	 {
    	  if(obj!=(null))   	 
    		 System.out.println(obj); 
    	 } 
    	 catch(Exception e)
    	 {
    	  System.out.println(obj); 
    	 }   	     
      }   		  
	}
}
