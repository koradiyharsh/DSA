/*
package Array;

public class countInv {


    public static void main(String[] args) {
        int arr[] = {468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392, 105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312, 323};
        int N = arr.length;
        int start = 0;
        int end = N - 1;
        int res =  mergeSortForInversion(arr, start, end, 0);
        System.out.println(res);
    }

    private static int mergeSortForInversion(int[] arr, int start, int end, int r) {

        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count+=mergeSortForInversion(arr, start, mid, r);
            count+=mergeSortForInversion(arr, mid + 1, end, r);
            count+=mergeCombineTogether(arr, start, mid, end, r);

        }
        return count;

    }

    private static int mergeCombineTogether(int[] arr, int start, int mid, int end, int res) {
        int swap =0;
        int l = (mid - start) + 1;
        int r = (end - mid);
        int k = start;
        int[] a1 = new int[l];
        int[] a2 = new int[r];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = arr[start + i];
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = arr[mid + 1 + i];
        }
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < a1.length && ptr2 < a2.length) {
            if (a1[ptr1] > a2[ptr2]) {
                arr[k] = a2[ptr2];
                swap += (mid)

                k++;
                ptr2++;
            } else {
                arr[k] = a1[ptr1];
                k++;
                ptr1++;
            }
        }
        if (ptr1 == a1.length) {
            while (ptr2 < a2.length) {
                arr[k] = a2[ptr2];
                k++;
                ptr2++;
            }
        }
        if (ptr2 == a2.length) {
            while (ptr1 < a1.length) {
                arr[k] = a1[ptr1];
                k++;
                ptr1++;
            }
        }
        return swap;


    }
}
*/
