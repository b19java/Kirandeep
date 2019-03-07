package Msheet;

import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("\nWel come to marks sheet");
		System.out.print("Enter the name of Student \t:\t");
		String name=sc.next();
		System.out.print("Enter the Roll Number \t\t:\t");
		String roll=sc.next();
		System.out.print("Enter the College Name \t\t:\t");
		String clg=sc.next();
		System.out.print("\nEnter the Marks of Sub1 \t:\t");
		int s1=sc.nextInt();
		System.out.print("Enter the Marks of Sub2 \t:\t");
		int s2=sc.nextInt();
		System.out.print("Enter the Marks of Sub3 \t:\t");
		int s3=sc.nextInt();
		System.out.print("Enter the Marks of Sub4 \t:\t");
		int s4=sc.nextInt();
		System.out.print("Enter the Marks of Sub5 \t:\t");
		int s5=sc.nextInt();

		int total;
		float percent;
		total=s1+s2+s3+s4+s5;
		percent=total/5;

		System.out.print("\n\n\t\t   Marksheet");
		System.out.print("\n-----------------------------------------------------");
		System.out.print("\n\tName\t\t:\t"+name);
		System.out.print("\n\tRoll No.\t:\t"+roll);
		System.out.print("\n\tCollege\t\t:\t"+clg);
		System.out.print("\n-----------------------------------------------------");
		System.out.print("\n\tSubject\t\t:\tMarks");
		System.out.print("\n\tSub1\t\t:\t"+s1);
		System.out.print("\n\tSub2\t\t:\t"+s2);
		System.out.print("\n\tSub3\t\t:\t"+s3);
		System.out.print("\n\tSub4\t\t:\t"+s4);
		System.out.print("\n\tSub5\t\t:\t"+s5);
		System.out.print("\n-----------------------------------------------------"); 
		System.out.print("\n\tTotal\t\t:\t"+total);
		System.out.print("\n\tPercentage\t:\t"+percent);

		if(percent>=60)
		{
		System.out.print("\n\tDivision\t:\tFirst");
		}

		if(percent>=40 && percent<60)
		{
		System.out.print("\n\tDivision\t:\tSecond");
		}

		if(percent<40)
		{
		System.out.print("\n\tDivision\t:\tThird");
		}
	}

}
