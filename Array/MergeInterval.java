package Array;

import java.util.ArrayList;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 6}, {8, 10}, {15, 18} , {18,20} , {19 ,25} , {25 ,50}};
        List<int[][]> result = new ArrayList<>();
        int lower =  intervals[0][0];
        int upper = intervals[0][1];

        for(int[] array :  intervals){

            int left =  array[0];
            int right = array[1];
            if(lower == left && upper==right){
                continue;
            }
            else if(left<=upper){
                lower  =Math.min(lower , left);
                upper = Math.max(upper ,right);
            }
            else{
                result.add(new int[][]{{lower ,upper}});
                lower = left;
                upper = right;
            }
        }
        result.add(new int[][]{{lower ,upper}});
        for(int[][]  arr1:  result){
            int[][] ele = arr1;
            System.out.print(ele[0][0]+" "+ele[0][1]);
            System.out.println();
        }

    }
}
