package ArmStrongNum;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, a, temp;
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter any number");
		  int n=s.nextInt();
	      temp = n;
	      while (n > 0)
		  {
	         a = n % 10;
	         n = n / 10;
	         c = c + (a * a * a);
	      }
	      if (temp == c)
	         System.out.println("Number is armstrong ");
	      else
	         System.out.println("Number is not an armstrong ");
	}

}
