/*
package String;

public class LongestPalindromicStr {
    static StringBuffer strbfr = new StringBuffer();
    public static void main(String[] args) {
        String str = "Geeks";
        int i = 0;
        int j = 0;
        String rev = new StringBuilder(str).reverse().toString();
        findLongestPalindrome(str, rev, i, j, str.length());

    }

    public static void findLongestPalindrome(String str, String rev, int i, int j, int length) {
        if (i >= length || j >= length) {
            return;
        }
        if(str.charAt(i) == rev.charAt(j)){
            strbfr.append(str.charAt(i));
            i++;
            j++;
        }
        findLongestPalindrome(str ,rev , i++ ,j , length);
        findLongestPalindrome(str ,rev , i  ,j++ ,length);
    }
}
*/
