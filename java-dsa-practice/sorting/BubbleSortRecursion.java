public class BubbleSortRecursion {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 4, 7, 9, 8, 3, 6, 4, 0 };

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(bubbleSort(nums, 0, 0)));
    }

    static int[] bubbleSort(int[] nums, int i, int j) {
        if (i < nums.length) {
            if (j < nums.length - 1 - i) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                return bubbleSort(nums, i, ++j);
            }

            return bubbleSort(nums, ++i, 0);
        }

        return nums;
    }
}
