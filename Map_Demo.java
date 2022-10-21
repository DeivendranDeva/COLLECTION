package october;

import java.util.TreeMap;

public class Map_Demo {

	public static void main(String[] args)
	{
      TreeMap T = new TreeMap(new myComparator_class());
      
    		T.put(new Students("DEVA",1,12,22),new Laptop_obj("DELL",8,40000,"MINT")) ;
    		T.put(new Students("PRADEEP",2,10,21),new Laptop_obj("ACER",4,30000,"UBUNTU")) ;
    		T.put(new Students("RAM",3,12,20),new Laptop_obj("AVITA",8,35000,"LINUX MINT")) ;
    		T.put(new Students("ARUN",4,12,24),new Laptop_obj("LENOVO",4,25000,"KAALI LINUX")) ;

    		for(Object o:T.entrySet())
    		{
    			System.out.println(o);
    		}

    		

    		
    		
    		
	}

}
