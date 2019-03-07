package V1;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str;
	        int v = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter your string : ");
	        str = s.nextLine();
	        for (int i = 0; i < str.length(); i++) {
	            Character c = str.charAt(i);
	            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c ==
	                    'o' || c == 'u') {
	                v++;
	            } 
	        }
	        System.out.println("No of vowels "+v);
	    }
	}


