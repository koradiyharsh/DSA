package Array;

public class KthSmallest {
    public static void main(String[] args) {
        int array[] = {7 , 10 ,  4 , 3 , 20,  15};
        int result  = kthsmallest(array , 0 , array.length-1 ,3);
        System.out.println(result);
    }

    private static int kthsmallest(int[] arr, int l, int r, int k) {
        if(l >= r)
        {
            return arr[k-1];
        }

        int pi = partition(arr, l, r);
        if(pi>=(k-1)){
            return kthsmallest(arr, l, pi-1, k);
        }else{
            return kthsmallest(arr, pi+1, r, k);
        }
    }
    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int start, int end)
    {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++)
        {
            if(pivot > array[j])
            {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, end);
        return i;
    }

}
