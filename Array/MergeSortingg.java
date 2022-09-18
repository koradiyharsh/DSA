package Array;

public class MergeSortingg {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 2, 3};
        int start = 0;
        int end = arr.length - 1;
        mergeSorting(arr, start, end);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }

    private static void mergeSorting(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSorting(arr, start, mid);
            mergeSorting(arr, mid + 1, end);
            combineMerge(arr, start, mid, end);
        }
    }

    private static void combineMerge(int[] arr, int start, int mid, int end) {

        int l = (mid - start) + 1;
        int r = end - mid;
        int k = start;
        int[] left = new int[l];
        int[] right = new int[r];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < left.length && ptr2 < right.length) {

            if (left[ptr1] < right[ptr2]) {
                arr[k] = left[ptr1];
                k++;
                ptr1++;
            } else {
                arr[k] = right[ptr2];
                k++;
                ptr2++;
            }
        }

        if(ptr1==left.length){
            while (ptr2 < right.length){
                arr[k] = right[ptr2];
                k++;
                ptr2++;
            }
        }
        if(ptr2==right.length){
            while (ptr1 < left.length){
                arr[k] = left[ptr1];
                k++;
                ptr1++;
            }
        }


    }
}
