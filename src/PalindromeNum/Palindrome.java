package PalindromeNum;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no.");
		int n =s.nextInt();
		int sum = 0;
		int rev;
		while(n>0)
		{
		rev=n%10;
		sum=(sum*10)/rev;
		n=n/10;
		}
		if(n==sum)
		{
		System.out.println("no. is palindrome");
		}
		else
		{
		System.out.println("no. is not palindrome");
		}
	}

}
