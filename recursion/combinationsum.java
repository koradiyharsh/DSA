package recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationsum {
    static List<List<Integer>> main = new ArrayList<>();
    static List<Integer> sub =  new ArrayList<>();
    public static void main(String[] args) {
        int candidate[] = {2, 3, 6, 7};
        int target = 7;
        printAllCombinationSum(candidate , 0 ,candidate.length , target , main ,sub);
        for(List<Integer> print :  main){
            System.out.print(print+" ");
        }
    }

    private static void printAllCombinationSum(int[] arr, int i, int n, int target, List<List<Integer>> main, List<Integer> sub) {
        if(target==0){
             main.add(new ArrayList<>(sub));
             return;
        }
        if(i>=n || target<0){
            return;
        }
        sub.add(arr[i]);
        printAllCombinationSum(arr , i , n , target - arr[i] , main ,sub);
        sub.remove(sub.size()-1);
        printAllCombinationSum(arr , i+1 , n , target , main ,sub);


    }
}
