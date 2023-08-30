import java.util.ArrayList;
import java.util.List;

class LogestCommonPrefix {
    Node root;
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        root = new Node('\0');
        int min = Integer.MAX_VALUE;
        List<Integer> list  = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            int count = insert(strs[i], i);
            if(i != 0) //skip for first word or else min wont be updated
                min = Math.min(min, count);
        }
        min = Math.min(min, strs[0].length());
        return strs[0].substring(0, min);
    }

    public int insert(String word, int n) {
        Node curr = root;
        int count  = 0;
        for(char ch: word.toCharArray()) {
            if(curr.children[ch - 'a'] == null) {
                if(n != 0) //skip for first word or else trie wont be constructed
                    return count;
                curr.children[ch - 'a'] = new Node(ch);
            } else {
                count++;
            }
            curr = curr.children[ch - 'a'];
        }
        return count;
    }
    
    class Node {
        private char value;
        private Node[] children;

        public Node(char val) {
            this.value = val;
            this.children = new Node[26];
        }
    }
}