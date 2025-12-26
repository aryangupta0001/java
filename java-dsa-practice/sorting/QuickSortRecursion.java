import java.util.Arrays;

public class QuickSortRecursion {
    public static void main(String[] args) {
        // int[] nums = { 1, 4, 2, 7, 8, 3, 6, 5, 9, 0, 1, 5, 3, -987, -52 };
        int[] nums = { 1, 4, 2, 7, 8, 3, 6 };

        System.out.println(Arrays.toString(nums));

        quickSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }

    static void quickSort(int[] nums, int low, int high) {

        boolean debug_result = false;

        if (low >= high)
            return;

        int s = low, e = high;

        int m = s + (e - s) / 2;
        int pivot = nums[m];

        if (debug_result) {
            System.out.print(s + " " + m + " " + e + "\t\t\t");

            for (int i = s; i < m; i++)
                System.out.print(nums[i] + " ");

            System.out.print("\t" + nums[m] + "\t");

            for (int i = m + 1; i <= e; i++)
                System.out.print(nums[i] + " ");
        }

        while (true) {
            while (nums[s] < pivot)
                s++;

            while (nums[e] > pivot)
                e--;

            if (s <= e) {
                int temp = nums[s];
                nums[s++] = nums[e];
                nums[e--] = temp;
            }

            if (s > e)
                break;
        }

        if (debug_result) {
            System.out.println();
            System.out.print(s + " " + m + " " + e + "\t\t\t");

            for (int i = low; i < m; i++)
                System.out.print(nums[i] + " ");

            System.out.print("\t" + nums[m] + "\t");

            for (int i = m + 1; i <= high; i++)
                System.out.print(nums[i] + " ");

            System.out.println();
        }

        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
