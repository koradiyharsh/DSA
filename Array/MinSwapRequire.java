package Array;

public class MinSwapRequire {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;
        int ptr = 0;
        int start = 0;
        int swap = 0;
        while (start < arr.length) {
            if (arr[start] >= k) {
               ptr=start;
            }

            start++;
        }
        System.out.println(swap);
    }

}
