package stack_queue;

import java.util.ArrayList;
import java.util.List;

public class firstNagativeNum_k {
    public static void main(String[] args) {
        long[] arr = {-8 ,2 , 3 , -6 ,10};
        int N  =arr.length;
        int K =2;
        int i=0, j=0;
        ArrayList<Long> list = new ArrayList<>();
        long[] ans = new long[N-K+1];

        while(j < N){
            if(arr[j] < 0){
                list.add(arr[j]);
            }

            if(j-i+1 == K){
                if(list.size() == 0){
                    ans[i] = 0;
                }
                else{
                    ans[i] = list.get(0);
                    list.remove(Long.valueOf(arr[i]));
                }
                i++;;
            }

            j++;
        }

    }
}
