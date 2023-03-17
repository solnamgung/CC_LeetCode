/**
 * Given an integer x, return true if x is a palindrome
 * , and false otherwise.
 * Follow up: Could you solve it without converting the integer to a string?
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right 
 * and from right to left.
 */

 
 	function isPalindrome(x) {
		 let str = x.toString();
		 let reversedStr = str.split('').reverse().join('');
		 
		 if(reversedStr = str) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	
	// Example usage
	let x = 121;
	console.log(isPalindrome(x)); // Output: true
