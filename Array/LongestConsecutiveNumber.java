package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumber {
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int best = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {  // only check for one direction
                int m = n + 1;
                while (set.contains(m)) {
                    m++;
                }
                best = Math.max(best, m - n);
            }
        }
        System.out.println(best);
    }
}
