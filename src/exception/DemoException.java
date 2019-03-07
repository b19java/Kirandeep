package exception;

public class DemoException {
	public static void main(String args[])
	{
		int abc[]= {10,20,30,40,50};
		
	
	
try
{
	int res=40/0;

}
catch(ArithmeticException e)

{
	System.out.println("Exception Occur");
}
/*catch(ArrayIndexOutOfBounds e)
{
	System.out.println("ArrayIndexOutOfBounds occur");
}*/

}
}
