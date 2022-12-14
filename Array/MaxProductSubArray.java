package Array;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] A = {-2, -3, 0, -2, -40 };
        int n = A.length, res = A[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * A[i];
            r =  (r == 0 ? 1 : r) * A[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        System.out.println(res);
    }
}
