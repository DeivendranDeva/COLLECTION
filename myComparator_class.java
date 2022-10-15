package october;

import java.util.Comparator;

public class myComparator_class implements Comparator{

	@Override
	public int compare(Object o1, Object o2) 
	{
	  Students s1 = (Students)o1;
	  Students s2 = (Students)o2;
	  if(s1.getAge()>s2.getAge())
	  {
	    return 3122;
	  }
	  else if(s1.getAge()<s2.getAge())
	  {
		return -233;
	  }
	  else
	    return 0;	  
	}

	
}
