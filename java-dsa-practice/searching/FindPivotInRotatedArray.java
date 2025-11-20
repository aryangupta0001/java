public class FindPivotInRotatedArray {
    public static void main(String[] args) {
        int [] nums = {2, 3, 3, 4, 4, 4, 4, 4, 4, 5, 6, 6, 0, 0, 1, 1, 2, 2};

        int beg = 0, end = nums.length, pivot = nums.length - 1;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;

            if(mid < end && nums[mid] > nums[mid  + 1]){
                pivot = mid;
                break;
            }

            if(mid > beg &&  nums[mid] < nums[mid - 1]){
                pivot = mid - 1;
                break;
            }
            
            if(nums[mid] < nums[beg])
                end = mid - 1;
            
            else
                beg = mid + 1;
        }

        System.out.println(pivot);

    }
}
