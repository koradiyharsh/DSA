package recursion;

import java.util.*;

public class combination_II {
    static Set<List<Integer>> main = new HashSet<>();
    static List<Integer> sub = new ArrayList<>();

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        combinationSum(arr, 0, arr.length, target, sub, main);
        for (List<Integer> print :  main){
            System.out.print(print+" ");
        }

    }

    private static void combinationSum(int[] arr, int i, int n, int target, List<Integer> sub, Set<List<Integer>> main) {
        if(target==0) {
            Collections.sort(sub);
            if (!main.contains(sub)) {
                main.add(new ArrayList<>(sub));
                return;
            }
        }
            if(i>=n || target<0){
                return;
            }
            sub.add(arr[i]);
            combinationSum(arr , i+1  , n , target-arr[i] , sub ,main);
            sub.remove(sub.size()-1);
            combinationSum(arr , i+1  , n , target, sub ,main);

        }

}
