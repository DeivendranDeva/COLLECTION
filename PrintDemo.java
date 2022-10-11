package october;

public class PrintDemo {
	
	  public void printCount()
	  {
		  try {
		  for(int i=1 ; i<5 ; i++)
		  {
		    System.out.println(i);	    	
		  }
		      }
		  catch(Exception d)
		  {
			  System.out.println("Interupted");
		  }
		  
	  }

	public static void main(String[] args) 
	{
		PrintDemo PD = new PrintDemo();
		
		PrintDemo1 T1 = new PrintDemo1("Thread-1",PD);
		PrintDemo1 T2 = new PrintDemo1("Thread-2",PD);
		
		T1.start();
		T2.start();
		
		try 
		{		
			T1.join();
			T2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interupted");
		}
	}

}


