package interfaces;

public class InterfaceDemo implements I1,I2 {
	public void show1()
	{
		System.out.println("show1"+i);
		int x=I1.display(120,60);
		System.out.println("..."+x);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		I1.super.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display"+x);
		int res=I1.display(10,80);
		System.out.println(""+res);
	}
}
	
