import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] nums = { 1, 3, 5, 5, 7, 9, 40, 54, 56};
        int[] nums = { 40, 29, 27, 23, 12, 10, 5, 3, 2, 1};
        int target = 3;

        int beg = 0, end = nums.length - 1;

        Boolean ascending = (nums[end] - nums[beg]) > 0 ? true : false, found = false;

        System.out.println(Arrays.toString(nums));

        if (ascending) {
            while (beg <= end) {
                int mid = beg + (end - beg) / 2;
                if (nums[mid] == target) {
                    System.out.println(target + " found at index : " + mid);
                    found = true;
                    break;
                }
                
                else if (nums[mid] > target)
                end = mid - 1;
                
                else
                beg = mid + 1;
            }
        }
        
        else
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] == target) {
                System.out.println(target + " found at index : " + mid);
                found = true;
                break;
            }

                else if (nums[mid] > target)
                    beg = mid + 1;

                else
                    end = mid - 1;
            }

        if (!found)
            System.out.println(target + " is not available in the Array");
    }
}
