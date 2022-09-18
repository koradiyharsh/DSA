package Array;

public class MergeSortPrectice {
    public static void main(String[] args) {
        int[] arr = {9, 7, 3, 6, 2};
        int start = 0;
        int end = arr.length-1;
        merge(arr, start, end);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void merge(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            merge(arr, start, mid);
            merge(arr, mid + 1, end);
            mergeCombine(arr, start, mid, end);
        }
    }

    private static void  mergeCombine(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
