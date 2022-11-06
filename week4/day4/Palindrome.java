package week2.day4.assignment;

public class Palindrome {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

	public static void main(String[] args) {
       
		//Declaring a String
		 String text="Madam";
		 
		 //Declare another String to store the reverse value
		 String reverseTxt="";
		 
		 //toCharArray()
		 char[] result=text.toCharArray();
		 
		 for(int i= result.length-1;i>=0;i--)
		 {
			 reverseTxt=reverseTxt+result[i];
		 }
		
           System.out.println(reverseTxt);
           
           //Comparing reverse string with original
           
           if(text.equalsIgnoreCase(reverseTxt))
           {
        	   System.out.println("Given Text " +text+ " is Palindrome");
        	   
           }
           else
           {
        	   System.out.println("Given Text " +text+ " is not Palindrome");
           }
           
	}
	

}
