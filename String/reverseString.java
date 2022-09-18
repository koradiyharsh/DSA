package String;

public class reverseString {
    public static void main(String[] args) {
        String s = "Geeks";
        int start = 0;
        int n = s.length();
        while (start <= n) {
            char c = s.charAt(start);
            char c1 = s.charAt(n - 1);
            char temp = c;
            c = c1;
            c1 = temp;
            start++;
            n--;
        }
    }
}
