import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 3, 6, 5, 10, 1, 9, 7, 8 };
        int i = 0, temp;

        System.out.println(Arrays.toString(nums));

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
            else
                i++;
        }

        System.out.println(Arrays.toString(nums));
    }
}