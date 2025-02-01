//https://www.hackerrank.com/contests/justcode/challenges/lru-implementtion/problem
import java.io.*;
import java.util.*;


public class Solution {
    
public static void simulateLRU(int n, int cap, List<Integer> sequence) {
        List<Integer> cache = new ArrayList<>();
    int c=0;

        for (int num : sequence) {
            if (cache.contains(num)) {
                cache.remove(Integer.valueOf(num));
                
                cache.add(0, num); // Add to the front
            } else {
                c++;
                // If the cache is full, remove the least recently used item (last element)
                if (cache.size() == cap) {
                    cache.remove(cache.size() - 1); 
                     // Remove the last element (LRU)
                }
                // Add the new number to the front
                cache.add(0, num);
            }
        }

        // Print the final state of the cache
        System.out.println(c);
        for (int i = 0; i < cache.size(); i++) {
            System.out.print(cache.get(i) + " ");
        }
    }

    public static void main(String[] args) {
                Scanner myObj = new Scanner(System.in);

       
        int n = myObj.nextInt();
        int cap = myObj.nextInt();

        // Read the sequence of numbers
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sequence.add(myObj.nextInt());
        }

     
        simulateLRU(n, cap, sequence);
           }
}
