package october;

import java.util.ArrayList;
import java.util.List;

public class Collection_Demo 
{
 public static void main(String args [])
		 {
	       List provision  = new ArrayList();
	       List provision2 = new ArrayList();
	     
	       
	       provision.add(4);
	       provision.add("Apple");
	       provision.add('T');
	       provision.add(false);
	       provision.add(12.00);
	       provision.add(4,"Mango");
	       provision.add("Apple");

	       
	       
	       provision2.add(4);
	       provision2.add("Apple");
	       provision2.add('T');
	       provision2.add(false);
	       provision2.add(12.00);
	       provision2.add(4,"Mango");
	       
//	       Object x = provision.get(0);
//	       String s = (String) x;
	      
	       
	       
	       List newlist = new ArrayList(provision);
                newlist.addAll(provision);
               
	       
	    // provision2.addAll(provision);
	     //  System.out.println(newlist);
	      // System.out.println(newlist.get(8));
	       
//	         boolean c = newlist.add(12);
//	         System.out.println(c);
	         
	     //  provision.contains('T');
	     //  provision.clear();
	       System.out.println(provision);
	     //  System.out.println(provision.contains('T'));
	     //  System.out.println(provision.containsAll(provision2));
	     //  System.out.println(provision2.addAll(0, provision3));
	     
	     //  System.out.println(provision.get(3));
	     
        	 provision.remove(0);
        	 provision.remove(4);
        	 
             System.out.println(provision);
             
	      
	     // System.out.println(newlist.size());
	     //  System.out.println(provision.isEmpty());
	      
	       
	            
	       
		 }
 
 
}
