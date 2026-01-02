/*
Merge Sort uses Divide - & - Conquer Approaches, it has O(n log(n)) runtime complexity across all cases, i.e - Best, Worst & Average

It keeps dividing the array into two equal parts in every recursive call, so log(n)
And in every Recursive call, to sort & merge it iterates over the whole array that the function receives as argument, so log(n) times n.

And hence - O(n log(n))
*/

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 7, 8, 3, 6, 5, 9, 0, 1, 5, 3, -987, -52 };

        mergeSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }

    static void mergeSort(int[] nums, int beg, int end) {
        if (beg == end)
            return;

        int mid = beg + (end - beg) / 2;

        mergeSort(nums, beg, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, beg, mid, end);

    }

    static void merge(int[] nums, int beg, int mid, int end) {

        int[] arr = new int[end - beg + 1];
        
        int i = beg, j = mid + 1, k = 0;

        while (i <= mid && j <= end)
            if (nums[i] <= nums[j])
                arr[k++] = nums[i++];

            else
                arr[k++] = nums[j++];

        while (i <= mid)
            arr[k++] = nums[i++];

        while (j <= end)
            arr[k++] = nums[j++];

        k = 0;

        for (i = beg; i <= end; i++)
            nums[i] = arr[k++];
    }
}
