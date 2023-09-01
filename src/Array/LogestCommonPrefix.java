import java.util.Arrays;

class Main {
    public String longestCommonPrefix(String[] strs) {
        // Existing implementation of longestCommonPrefix method
        // (Same as your previous code)
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        StringBuilder commonPrefix = new StringBuilder();
        int minLength = Math.min(firstStr.length(), lastStr.length());
        for (int i = 0; i < minLength; i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        String[] example = {"flower", "fly", "flight", "flue"};
        String result = main.longestCommonPrefix(example);
        System.out.println("Longest Common Prefix: " + result);
    }
}
