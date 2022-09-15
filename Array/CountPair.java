package Array;

import java.util.HashMap;
import java.util.Map;

public class CountPair {
    public static void main(String[] args) {
        int[] arr = {1 ,5, 7 , 1};
        int k = 6;
        Map<Integer,Integer> map =  new HashMap<>();
        int result = 0;
        for(int i=0;i<arr.length;i++){
            int val =  k - arr[i];
            if(!map.containsKey(val)){
                map.put(arr[i] ,1);
            }
            else{
                result += map.get(val);
                int incr =  map.get(val) +1;
                if(val == arr[i]){
                    map.put(val , incr);
                }else{
                    map.put(arr[i] ,1);
                }
            }
        }
        System.out.println(result);

    }
}
