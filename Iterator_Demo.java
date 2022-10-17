package october;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Demo {

	public static void main(String[] args) 
	{
       List I = new ArrayList();
            I.add("Laptop");
            I.add("Mobile");
            I.add("Smartwatch");
            I.add(12);
            I.add(34);
            
//     java.util.Iterator itr = I.iterator();    
//     while(itr.hasNext())
       {
//         System.out.println(itr.next());
//    	   if(itr.next()>)
//    	   itr.remove();    	   
       }
       
	   List <String> sample = new ArrayList<String>();
	   
	   sample.add("Headphone");
	   sample.add("Speaker");
	   sample.add("Bluetooth");
	   sample.add("Powerbank");	
	   sample.add("Speaker");
	   
	 //  sample.remove("Speaker");
	   
	   System.out.println(sample);
	   
       ListIterator itr1 = sample.listIterator(sample.size());
       
//       while(itr1.hasNext())
//       {
//    	   if(itr1.next().equals("Speaker"))
//    	   {
//    		   itr1.remove();
//    	   }
//       }
//	     System.out.println(sample);
	   
	   while(itr1.hasPrevious())
	   {
		 System.out.println(itr1.previous());
	   }
	   
	}

}
