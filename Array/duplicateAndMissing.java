package Array;

import java.util.ArrayList;
import java.util.List;

public class duplicateAndMissing {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(4);
        int n  = arr.size();
        int[] array = new int[n+1];
        for(Integer ele : arr){
            array[ele] +=1;
        }
        int[] result = new int[2];
        for(int j=1;j<array.length;j++){
            if(array[j]==2){
                result[1] = j;
            }
            if(array[j]==0){
                result[0] = j;
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
