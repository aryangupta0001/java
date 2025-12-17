import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        // int[] nums = { 2, 4, 3, 6, 5, 10, 1, 3, 2, 1, 9, 7, 8 };
        // int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] nums = { 2, 3, 2 };

        int [] ans = new int[2];

        int i = 0, temp, n = nums.length;

        // System.out.println(Arrays.toString(nums));

        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else
                i++;
        }

        for (i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1])
                ans[0] = nums[i];

            if (nums[i] != i + 1) {
                ans[1] = i + 1;
            }
        }
        if (nums[i] != i + 1) {
            ans[1] = i + 1;
        }


        System.out.println(Arrays.toString(ans));

        // System.out.println(Arrays.toString(nums));
    }
}