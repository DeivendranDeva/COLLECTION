package october;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mapping_Demo
{
	public static void main(String[] args) 
	{
      Map m = new TreeMap<String,Integer>();//String replace mobile<Mobile,Integer>
      
      m.put("ASUS 2018", 10000);
      m.put("SAMSUNG 2021", 25000);
      m.put("VIVO 2021" , 15000);
      m.put("ONEPLUS 2022", 40000);
      m.put("OPPO 2021", 17000);
      m.put("HONOR 2019", 50000 );
      m.put("TECHNO 2020", 13000);
      m.put("HAWAEI 2022", 30000);
      m.put("IPHONE 2022", 65000);
      
      Set s = new TreeSet();
          s.addAll(m.keySet());
          
          for(Object o1 : s)
          {
        	  String name = o1.toString();
        	  if(name.startsWith("H") || name.startsWith("h"))
        	  {
        		  System.out.println(name+"\t RUPEES "+m.get(o1));       		
        	  } 
          }
 		  System.out.println();
 		  
 		  
 		  for(Object o1 : s)
 		  {
 			 if(20000<=(int)m.get(o1))
       	     {
       		  System.out.println(o1+"-->\tRUPEES "+m.get(o1));
       	     }  
 		  }
 		  System.out.println();
          
      
 		  
          for(Object o : s)
          {
        	   String name = o.toString();
        	   if(name.contains("2022"))
         	  {
         		  System.out.println("CURRENT YEAR MODEL :"+name);
         	  }
        	  
          }
          
          
                
      
      
//    System.out.println(m.putIfAbsent("PONGAL", 10)); 
//    System.out.println(m.replace("DHOSA", 20 , 25));
     
  //     System.out.println(m);
 //     System.out.println(m.containsKey("IDLY"));
//     System.out.println(m.remove("PONGAL",10));  //returns boolean

      
   //   Set s = m.keySet();
   //  System.out.println(s);
     
    //  Set s1 = m.entrySet();
   //  System.out.println(s1);
     
   //   System.out.println(m.values());
	}
}
