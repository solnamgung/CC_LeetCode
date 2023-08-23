package Array;
import java.util.HashMap;
import java.util.Map;

//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//Example 1:
//Input: s = "III"
//Output: 3
//Explanation: III = 3.

//Example 2:
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.

//Example 3:
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class RomanToInteger {
	
    public int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	    
        char arr[] = s.toCharArray();
        int previous = 0;
        int result = 0;
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int current = map.get(arr[i]);
            if(previous > current){
                result -= current;
            }else{
                result += current;
            }
            previous = current;
        }
        return result;
    }
    
}
