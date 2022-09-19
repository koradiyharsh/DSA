package recursion;

public class countOfSubsequence {
    static int cnt = 0;

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int sum = 2;
        int result = countOfSubsequenceCall(arr, 0, arr.length, sum);
        System.out.println(result);
    }

    private static int countOfSubsequenceCall(int[] arr, int i, int n, int sum) {
        if (sum == 0) {
            return 1;
        }
        if (i >= n || sum < 0) {
            return 0;
        }
        int r = countOfSubsequenceCall(arr, i + 1, n, sum - arr[i]);
        int  l = countOfSubsequenceCall(arr, i + 1, n, sum);
        return l+r;
    }
}
