package week2.day4.assignment;

public class FindMissingNumber {
/*
 * // Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
 */
	public static void main(String[] args) {
		// Delcare an Array
		
		int[] arr ={1,2,3,4,7,6,8};
		int arrLength=arr.length;
		//To find the missing number
		//Using formulae (n*(n+1))/2; we have to sum all the array values
		int sumofArray=(arrLength*(arrLength+1))/2;
		int sum = 0;
		System.out.println("The length of the array is:"+arrLength);
		
		//For loop to Iterate through all the array values 
		//Sum the Array
		for(int i=0;i<=arrLength-2;i++)
		{
			sum = sum+arr[i];
		}
		
  // To find the missing number subtract the SumofAll with Sumof Array
		
		int missingNum =sumofArray - sum;
		System.out.println("The missing number are: "+missingNum);
	}

}
