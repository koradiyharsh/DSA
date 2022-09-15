package Array;

public class kadaneAlgo {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int smallsum = 0;
        int grandsum =0;
        int n  = nums.length;
        for(int i=0;i<n;i++){

            if(smallsum+nums[i] < 0){
                smallsum = 0;
            }else{
                smallsum+=nums[i];
            }
            if(grandsum < smallsum){
                grandsum = smallsum;
            }
        }
        System.out.println(grandsum);
    }
}
