package sort;

public class Sort {
    public static void main(String[] args) {
        String[] words = {
        		
//INSERT WORDS HERE        		
        		"aaa",
        		"aab",
        		"aba",
        		"baa",
        		"bab",
        		"bba",
        		"bbb"      
//INSERT WORDS HERE        		
        
        
        };
        for(int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order:");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}