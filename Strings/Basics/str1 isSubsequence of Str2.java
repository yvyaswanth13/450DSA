public class Main {
    public static boolean isSubsequence(String str, String str2) {
        int ind = 0, ind2 = 0;
        int count = 0;

        while (ind < str.length() && ind2 < str2.length()) {
            if (str.charAt(ind) == str2.charAt(ind2)) {
                count++;
                ind++;
            }
            ind2++;
        }

        return count == str.length();
    }

    public static void main(String[] args) {
        String str = "abc";
        String str2 = "zzacdbc";
        System.out.println(isSubsequence(str, str2)); // Output: true
    }
}
