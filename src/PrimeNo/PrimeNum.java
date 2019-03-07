package PrimeNo;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int x=s.nextInt();
		if(x/2==0)
		System.out.println("number is prime");
		else 
		System.out.println("number is not prime");

	}

}
