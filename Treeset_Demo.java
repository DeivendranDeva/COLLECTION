package october;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Treeset_Demo {

	public static void main(String[] args) 
	{
		 ArrayList ls = new ArrayList();
		ls.add("DOG");
		ls.add("CAT");

         Set ll = new TreeSet(new myComparator_class());		
		ll.add(new Students("Deva",1,12,21));
		ll.add(new Students("Pradeep",2,11,22));
		ll.add(new Students("Ram",3,12,23));
		
//	    ll.add(ls);
		for(Object o: ll)
		System.out.println(o);
	}

}
