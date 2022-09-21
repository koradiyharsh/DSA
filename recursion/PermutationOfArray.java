package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    static List<List<Integer>> master  = new ArrayList<>();
    static List<Integer> sub = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 };
        boolean[] track = new boolean[arr.length];
        printAllPermutation(arr , arr.length , sub ,master , track);
        for (List<Integer> print : master){
            System.out.println(print+" ");
        }

    }

    private static void printAllPermutation(int[] arr, int n, List<Integer> sub, List<List<Integer>> master ,boolean[] track) {
        if(sub.size()==n){
            master.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0 ; i< n;i++){
            if(track[i] ==false) {
                sub.add(arr[i]);
                track[i] = true;
                printAllPermutation(arr,n, sub,master, track);
                sub.remove(sub.size()-1);
                track[i] = false;
            }
        }
    }
}
