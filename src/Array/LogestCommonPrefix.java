import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int minLength = Math.min(first.length(), last.length());
        StringBuilder commonPrefix = new StringBuilder();

        for(int i = 0; i < minLength; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                commonPrefix.append(first.charAt(i));
            } else{
                break;
            }
        }
        return commonPrefix.toString();

    }
}