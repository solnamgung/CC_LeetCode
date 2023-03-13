package Easy;
/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * -231 <= x <= 231 - 1
 *  Follow up: Could you solve it without converting the integer to a string?
 */

/**
 * Input: x = 121
 * Output: true
 * rvplanation: 121 reads as 121 from left to right and from right to left.
 */

/**
 * Input: x = -121
 * Output: false
 * rvplanation: From left to right, it reads -121.
 * From right to left, it becomes 121-. Therefore it is not a palindrome.
 */

/**
 * Input: x = 10
 * Output: false
 * rvplanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNum {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while(temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        int rv = 0;
        int xx = 121;
        int tp = xx;

        while(tp != 0) {
            rv = rv * 10 + tp % 10;
            tp /= 10;
            System.out.println("rv >> " + rv);
            System.out.println("tp >> " + tp);
        }

    }
}
