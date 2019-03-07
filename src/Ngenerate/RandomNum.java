package Ngenerate;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args)
	 {
		// TODO Auto-generated method stub
	//System.out.println("Random number between 1000 to 10000:" +Math.random());
	System.out.println("Random number between 1000 to 10000 is :" +getRandom(10000));
	System.out.println("Random value between 1000 and 10000 is : " + getRandomInteger(10000, 1000));

     }
	public static int getRandom(int max) 
	{
		return(int) (Math.random()*max);
		
	}
	public static int getRandomInteger(int maximum , int minimum)
	{
		return ((int)(Math.random()*(maximum-minimum)))+minimum;
		
	}

}
