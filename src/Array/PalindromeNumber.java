package Array;
/*
 * Given an integer x, return true if x is a palindrome
 * ,and false otherwise.
 * Follow up: Could you solve it without converting the integer to a string?
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right 
 * and from right to left.
 */

public class PalindromeNumber {
	
// convert the integer 121 into an array 
// without converting the integer to a string
	
	

//	   	int length = (int)(Math.log10(x) + 1); 
//		int[] digits = new int[length];
//		
//		for(int i = length -1; i >= 0; i--) {
//			digits[i] = x % 10;
//			x = x / 10;
//		}
//		
//
//		for(int k = 0; k < digits.length; k++) {
//			System.out.print(digits[k] + " ");	
//	 }
//
//		int lowerBound = 0;
//		int upperBound = digits.length;
//		int binaryBound = (upperBound - lowerBound) / 2 ;
//		
//		for(int j = 1; j < digits.length/2; j++) {
//			if(digits[binaryBound - j] != digits[binaryBound + j])
//	
//		 return false;
//		}
//		
//		return true;
	
	public static boolean isPalindromeNumber(int x) {
		
	
	 StringBuilder str = new StringBuilder();
	 str.append(x);
	 String result = str.toString();
	 
	 if(str.reverse().toString().equals(result)) {
		 return true;
	 } else {
		 return false;
	 }
 
	}
	

//	    public boolean isPalindrome(int x) {
//	    if(x < 0) {
//	            return false;
//	        }
//	        int reverse = 0;
//	        int temp = x;
//	        while(temp != 0) {
//	            reverse = reverse * 10 + temp % 10;
//	            temp /= 10;
//	        }
//	        return reverse == x;
//	
//	}	
//}
	 
//	 the way of converting Integer to String
//	 public class Main {
//		    public static void main(String[] args) {
//		        int number = 121;
//		        String numberStr = Integer.toString(number);
//		        int[] digits = new int[numberStr.length()];
//
//		        for (int i = 0; i < numberStr.length(); i++) {
//		            digits[i] = Character.getNumericValue(numberStr.charAt(i));
//		        }
//
//		        // Print the resulting array
//		        System.out.print("Array: [");
//		        for (int i = 0; i < digits.length; i++) {
//		            System.out.print(digits[i]);
//		            if (i < digits.length - 1) {
//		                System.out.print(", ");
//		            }
//		        }
//		        System.out.println("]");
//		    }
	 
}	 


