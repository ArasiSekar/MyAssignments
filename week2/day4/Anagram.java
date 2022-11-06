package week2.day4.assignment;

import java.util.Arrays;

public class Anagram {
	/*
	 *  anagram is a word or phrase formed by rearranging the letters.
	 *  For example, Race and Care. Here, we can form Race by arranging the characters of Care.
	 *  
	 *  *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 */

	public static void main(String[] args) {
		// Declare str1 and str2 with same length
		
		String str1= "stops";
		String str2= "potss";
		//Check both the String length are same
			if(str1.length()!=str2.length())
			{
				System.out.println("Both Strings not equal , they are not Anagram");
				
				
			}else
			{
				System.out.println("Both Strings are in same Length");
				//converting to Char array
				char[] ch1=str1.toCharArray();
				char[] ch2=str2.toCharArray();
				//sorting both arrays
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				//Checking both arrays are equals
				if(Arrays.equals(ch1, ch2)) {
					System.out.println("String 1 "+str1+ " and "+str2+ " are Anagram");
				}
				else
				{
					System.out.println("String 1 "+str1+ " and "+str2+ " are not Anagram");
				}
			}
		
		
		

	}

}
