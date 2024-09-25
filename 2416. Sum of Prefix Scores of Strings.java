class Node {
    Map<Character, Pair> umc = new HashMap<>();
    boolean isEnd = false;
}

class Pair {
    int count;
    Node node;

    Pair(int count, Node node) {
        this.count = count;
        this.node = node;
    }
}

class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String s) {
        Node cur = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cur.umc.containsKey(c)) {
                cur.umc.put(c, new Pair(0, new Node()));
            }
            cur.umc.get(c).count++;
            cur = cur.umc.get(c).node;
        }
        cur.isEnd = true;
    }

    public int checkPrefixCount(String s) {
        Node cur = root;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!cur.umc.containsKey(c)) {
                break;
            }
            count += cur.umc.get(c).count;
            cur = cur.umc.get(c).node;
        }
        return count;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        
        for (String word : words) {
            trie.insert(word);
        }

        int[] ans = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ans[i] = trie.checkPrefixCount(words[i]);
        }

        return ans;
    }
}
