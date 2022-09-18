package Array;

public class countInversion {
    static int inversionCount = 0;

    public static void main(String[] args) {
        // {468 ,335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392 ,105 ,403 ,154 ,293 ,383 ,422 ,217, 219 ,396, 448 ,227, 272, 39 ,370 ,413 ,168, 300, 36 ,395, 204 ,3,12, 323};
        int arr[] = {2, 4, 1, 3, 5};
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
        System.out.println(inversionCount);
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, start);
            mergeCombine(arr, start, mid, end);
        }
    }

    private static void mergeCombine(int[] arr, int start, int mid, int end) {
        int n1 = (mid - start) + 1;
        int n2 = (end - mid);
        int[] r1 = new int[n1];
        int[] r2 = new int[n2];
        for (int i = 0; i < r1.length; i++) {
            r1[i] = arr[start+i];
        }
        for (int i = 0; i < r2.length; i++) {
            r2[i] = arr[mid+1+i];
        }
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (r1[i] <= r2[j]) {
                arr[k] = r1[i];
                i++;
            }
            else {
                arr[k] = r2[j];
                inversionCount+=(end-j);
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = r1[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = r2[j];
            j++;
            k++;
        }


    }
}
