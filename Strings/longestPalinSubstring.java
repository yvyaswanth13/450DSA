public class Solution {	

static int resultstart;
static int resultLength;
	public static String longestPalinSubstring(String str) {
		// Write your code here.

		if(str.length()<2)
		return str;

		for(int i=0;i<str.length();i++)
		{
			expandToCener(str,i,i);
			expandToCener(str,i,i+1);
			
		}

		return str.substring(resultstart, resultstart+resultLength);


	}

	static void expandToCener(String str, int begin, int end)
	{
		while(begin>=0&& end<str.length() && str.charAt(begin)==str.charAt(end))
		{
			begin--;
			end++;
		}
		if(resultLength<end-begin-1)
		{
			resultLength=end-begin-1;
			resultstart=begin+1;
		}
	}

}
/*
For "bccb":

When the loop exits:
begin = -1, end = 4
The actual start is at index 0 → begin + 1
The actual end is at index 3 → end - 1
Correct substring: "bccb"

*/
/*
TC:
Sample Input 1:
abccbc
Sample Output 1:
bccb
Explanation for input 1:
For string "abccbc",  there are several palindromic substrings such as "a", "b", "c", "cc", "bccb", and "cbc". However, the longest palindromic substring is "bccb".
Sample Input 2:
aeiou
Sample Output 2:
a
*/
