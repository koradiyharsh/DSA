package Array;

public class MedianOfTwo {
    public static void main(String[] args) {
       int n1  = 2;
       int[] a1 = new int[n1];
       a1[0] = 1;
        a1[1] = 2;

        int n2 = 2;
        int[] a2 = new int[n2];
        a2[0] = 3;
        a2[1] = 4;

        int temp[] = new int[n1+n2];
        for(int i=0;i<a1.length;i++){
            temp[i] =  a1[i];
        }
        for(int i=0;i<a2.length;i++){
            temp[i+n1] =  a2[i];
        }
        int start = 0;
        int end = temp.length - 1;
        mergeSorting(temp, start, end);
        int num  = temp.length;
        if(num%2!=0){
            System.out.println( temp[num/2]);
        }else{
            int n11 =  temp[num/2];
            int n22 =  temp[(num/2)-1];
            double d = n11 + n22;
            System.out.println(d/2);
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
