package recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class subset_II {
    static List<List<Integer>> master  = new ArrayList<>();
    static List<Integer> sub = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1 , 1 ,2};
        int start = 0;
        int end  = nums.length;
        generateSubsetOnlyUnique(nums , start , end , master , sub);
        for(List<Integer> printAll : master){
            System.out.print(printAll+" ");
        }

    }

    private static void generateSubsetOnlyUnique(int[] nums, int i, int n, List<List<Integer>> master, List<Integer> sub) {
        if(i==n){
            Collections.sort(sub);
            if(!master.contains(sub)){
                master.add(new ArrayList<>(sub));
            }
            return;
        }
        sub.add(nums[i]);
        generateSubsetOnlyUnique(nums , i+1 , n  ,master ,sub);
        sub.remove(sub.size()-1);
        generateSubsetOnlyUnique(nums , i+1 , n  ,master ,sub);
    }
}
