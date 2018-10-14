package threads;


public class MyFirstThread extends Thread
{
	private boolean isSuspended = false;

	public void run(){
		
		for(int i=1;i<=5;i++)
		{
			Math.sqrt(i);
			try
			{
				if(this.currentThread().getName().equals("Thread1") && i == 2)
				{
					this.destroy();
					
					
					//sychronized()
					{
						while(isSuspended)
						{
							this.wait();
						}
					}
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e.getStackTrace());
			}
			System.out.println(i + " - "+ this.currentThread().getName());
			
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*MyFirstThread m1 = new MyFirstThread();
		MyFirstThread m2 = new MyFirstThread();
		
		Thread thread1 = new Thread(m1);
		Thread thread2 = new Thread(m2);
		*/
		
		MyFirstThread thread1 = new MyFirstThread();
		MyFirstThread thread2 = new MyFirstThread();
		
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		thread1.setSuspended(true);
		
		try 
		{
			Thread.sleep(1000);
			thread1.setSuspended(false);
			
			//thread1.join(1500); // Waits for the thread to die for given period of milli seconds
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public boolean getIsSuspended() {
		return isSuspended;
	}

	public void setSuspended(boolean isSuspended) {
		this.isSuspended = isSuspended;
	}

}
