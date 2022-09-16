package Array;

public class TappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        int leftMax = arr[0];
        int rightMax = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            right[i] = Math.max(arr[i] ,rightMax);
            if(arr[i] > rightMax){
                rightMax = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            left[i] = Math.max(arr[i] ,leftMax);
            if(arr[i] > leftMax){
                leftMax = arr[i];
            }
        }
        int result = 0;
        for(int j=0;j<arr.length;j++){
            int min = Math.min(left[j] ,right[j]);
            result+= Math.abs(min - arr[j]);
        }
        System.out.println(result);
    }
}
