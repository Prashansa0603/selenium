package handle;

public class Exceptionhandling {

	public static void main(String[] args) 
	{
		int i , j , k=0;
		//int a[] = new int[4];
		i=8;
		j=1;
		try {
		k=i/j;
	//	for(int c=0;c<=4;c++)
	/*	{
			a[c]=c+1;
		}
		for(int value :a) {
			
		}*/
		}
		catch(ArithmeticException e)
		{
			System.out.println("can divide by zero"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum number of value is 4"+e);
		}
		catch(Exception e)
		{
			System.out.println("unknown exception");
		}
		System.out.println(k);
	}

}
