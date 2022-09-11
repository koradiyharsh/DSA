package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UnionIntersection {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
        HashSet<Integer> set =  new HashSet<>();
        int aArray =  a.length;
        int bArray = b.length;
        for(int  i=0;i<aArray;i++){
            set.add(a[i]);
        }
        for(int  i=0;i<bArray;i++){
            set.add(b[i]);
        }
        Iterator it =  set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
