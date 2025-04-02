    static int findSubstring(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        // Iterate through txt
        for (int i = 0; i <= n - m; i++) {

            // Check for substring match
            int j=0;
           while(j<m && pat.charAt(j)==txt.charAt(i+j))
           {
			j++;
            }

            // If we completed the inner loop, we found a match
            if (j == m) {

                // Return starting index
                return i;
            }
        }

        // No match found
        return -1;
    }
