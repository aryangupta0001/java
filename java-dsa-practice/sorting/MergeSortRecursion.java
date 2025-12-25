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

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1)
            return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        int[] arr = new int[left.length + right.length];

        while (i < left.length && j < right.length)
            if (left[i] <= right[j])
                arr[k++] = left[i++];

            else
                arr[k++] = right[j++];

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];

        return arr;
    }
}
