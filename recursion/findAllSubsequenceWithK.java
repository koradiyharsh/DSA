package recursion;

import java.util.ArrayList;
import java.util.List;

public class findAllSubsequenceWithK {
    static List<List<Integer>> main = new ArrayList<>();
    static List<Integer> sub = new ArrayList<>();

    public static void main(String[] args) {
        int arr[] = {17, 18, 6, 11, 2, 4};
        int K = 6;
        printallsubseqenceofarray(main ,sub , arr , 0 , K , arr.length);
        for (List<Integer> print : main){
            System.out.print(print+" ");
        }
    }

    private static void printallsubseqenceofarray(List<List<Integer>> main, List<Integer> sub, int[] arr, int i, int k, int n) {
        if(k==0){
            main.add(new ArrayList<>(sub));
            return;
        }
        if(i>=n || k<0){
            return;
        }
        sub.add(arr[i]);
        printallsubseqenceofarray(main , sub , arr , i+1 , k-arr[i] , n);
        sub.remove(sub.size()-1);
        printallsubseqenceofarray(main , sub , arr , i+1 , k , n);

    }
}
