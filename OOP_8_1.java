class FirstThreads extends Thread
{
  int n;
  FirstThreads(int n1)
  {
	  
	  n=n1;
  }
  public void run()
  {
 
     for (int i=1; i<=10; i++)
     {
      
        System.out.print( +n+ "* "+i+":" +(n*i)+"\t");

        try
        {
           Thread.sleep(1000);
        }
        catch (InterruptedException  interruptedException)
        {
          
          System.out.println(  "First Thread is interrupted when it is  sleeping" +interruptedException);
        }
      }   
   }
}
 
 
class OOP_8_1 {

	public static void main(String[] args) {
		
	    
	    FirstThreads   firstThread = new FirstThreads(5);
	    FirstThreads  firstThreads = new FirstThreads(7);
	 
	   
	   
	   
	    firstThread.start();

	    firstThreads.start();
	    
	 
	    
	  

	}

}