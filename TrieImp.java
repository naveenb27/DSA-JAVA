package TRIE;



public class TrieImp {

    static final int ALPHABAPET = 26;

    static class Trie {
        Trie[] children = new Trie[ALPHABAPET];
        boolean isWord;

        Trie(){
            this.isWord = false;
        }
    }

    static Trie root;

    static void insert(String s){
        int len = s.length();

        Trie temp = root;
        for(int level = 0;  level<len; level++){
            int index = s.charAt(level) - 'a';

            if(temp.children[index] == null)
                temp.children[index] = new Trie();
            temp = temp.children[index];
        }
        temp.isWord = true;
    }


    static boolean search(String s){
        int len = s.length();

        Trie temp = root;
        for(int i = 0; i<len; i++){
            int index = s.charAt(i) - 'a';

            if(temp.children[index] == null) return false;
            
            temp = temp.children[index];
        }

        return temp.isWord;
    }
    public static void main(String args[]){
        String keys[] = {"the", "a", "there", "answer", "any",
                         "by", "bye", "their"};
      
        String output[] = {"Not present in trie", "Present in trie"};
      
      
        root = new Trie();
      
        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);
      
        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
         
        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
    }
}
