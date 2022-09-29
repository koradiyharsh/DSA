package Array;

import java.util.ArrayList;
import java.util.List;

public class sumOfAllOddLengthArray {
    static List<List<Integer>> master = new ArrayList<>();
    static List<Integer> sub = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1 ,4 ,2 ,5 ,3};
        int n = arr.length;
        int i = 0;
        int sum =0;
        findAllSubset(master ,sub , i ,n , arr);
        for(List<Integer> list : master){
            if(list.size()%2 != 0){
                sum+=list.stream().reduce(0, Integer::sum);
            }
        }
        System.out.println(sum);

    }
    static void findAllSubset(List<List<Integer>> master , List<Integer> sub ,int i , int n , int[] arr){
        if(i==n){
            master.add(new ArrayList<>(sub));
            return;
        }

        sub.add(arr[i]);
        findAllSubset(master ,sub ,i+1, n, arr);
        sub.remove(sub.size()-1);
        findAllSubset(master ,sub ,i+1, n, arr);
    }

}
