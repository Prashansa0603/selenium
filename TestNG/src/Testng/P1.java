package Testng;

public class P1 {
	double sal = 30000;
	

}
 class P2 extends P1{
	int a= 10;
	public String demo()
	{
		return "hello";
	}
	
	}
class p3 extends P2
{
	public static void main(String[] args) {
		p3 p =new p3();
		System.out.println("a "+p.a);
		p.demo();
	System.out.println("sal "+p.sal);
		
	}

	
}