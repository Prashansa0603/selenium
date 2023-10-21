package handle;

class counter
{
int count;
public synchronized void increament() {
	count++;
}
}
public class Syncdemo {

	public static void main(String[] args) throws Exception {
		counter c= new counter();
		c.increament();
		Thread t1= new Thread(new Runnable()
				{
			   public void run() {
				   for(int i=1;i<=1000;i++)
				   {
					   c.increament();
				   }
			   }
				});
		Thread t2= new Thread(new Runnable()
		{
	   public void run() {
		   for(int i=1;i<=1000;i++)
		   {
			   c.increament();
		   }
	   }
		});
t1.start();
t2.start();
t1.join();
t2.join();
		System.out.println("count"+c.count);
	}

}

