package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubsequnceOfString {
    static List<List<String>> subsequences = new ArrayList<>();
    static List<String> substring = new ArrayList<>();

    public static void main(String[] args) {
        String str = "abc";
        printAllSubsequence(substring, subsequences, str, 0, str.length());
        for(List<String> print : subsequences){
            System.out.print(print+" ");
        }
    }

    private static void printAllSubsequence(List<String> sub, List<List<String>> subsequences, String str, int i, int n) {
            if(i >= n){
                subsequences.add(new ArrayList<>(sub));
                return;
            }
            sub.add(String.valueOf(str.charAt(i)));
            printAllSubsequence(sub , subsequences  , str , i+1 ,n);
            sub.remove(sub.size()-1);
            printAllSubsequence(sub , subsequences  , str , i+1 ,n);
    }
}
