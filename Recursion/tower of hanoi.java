public class Solution {
    
      static void hanoi(int n, char src, char aux, char dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        hanoi(n - 1, src, aux, dest);  // Step 1: Move n-1 disks from src to aux
        System.out.println("Move disk " + n + " from " + src + " to " + dest); // Step 2: Move nth disk to dest
        hanoi(n - 1, aux, dest, src);  // Step 3: Move n-1 disks from aux to dest
    }

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
         int n = 3; // Number of disks
        hanoi(n, 'A', 'B', 'C'); 
        //from bottom to top itially A=>3, 2, 1 B=(),c=();
        //
        //o/p from bottom to top A=() B=(),c=>3, 2, 1;
        
    }
}
