package october;

public class PrintDemo1 extends Thread{

	private Thread t;
	private String threadname;
	PrintDemo PD;

	public PrintDemo1(String name,PrintDemo pd) 
	{
		threadname=name;
		PD=pd;
	}

	
	public void start()
	{
		System.out.println("Starting "+threadname);
		if (t==null)
		{
			t=new Thread(this,threadname);
			t.start();
		}
	}
	
		
	public void run() 
	{
		synchronized(PD)
		{
		PD.printCount();
		}
		System.out.println(" exiting "+threadname);
	}
	
		
}
