package Array;

public class removeDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 4};
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        System.out.println(i);
    }
}
