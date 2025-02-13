import java.util.Arrays;

class GfG {
  
    static final int MAX_CHAR = 26;

    static char nonRepeatingChar(String s, int K) {
  
        int[] freq = new int[MAX_CHAR];

        // Count the frequency of all characters
        for (char c : s.toCharArray()) 
            freq[c - 'a']++;

        // Find the K-th non-repeating character
        int count = 0; // To track the number of non-repeating characters found
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                count++;
                if (count == K) 
                    return s.charAt(i);
            }
        }
    
        // If there are fewer than K non-repeating characters, return '$'
        return '$';
    }

    public static void main(String[] args) {
        String s = "racecar";
        int K = 2; // Change this value to get different non-repeating characters
  
        System.out.println(nonRepeatingChar(s, K));
    }
}
