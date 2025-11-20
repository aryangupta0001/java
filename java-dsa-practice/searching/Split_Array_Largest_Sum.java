public class Split_Array_Largest_Sum {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        int k = 5, sum = 0, i = 0, max = nums[0], j = 0, count = 0, minSum = 0;

        int[] ans = new int[1000];

        while (i < nums.length) {
            sum += nums[i];

            if (max < nums[i])
                max = nums[i];

            i++;
        }

        System.out.println("Max : " + max + "\nSum : " + sum);

        int a = max;
        int b = sum;

        while (a <= b) {
            int mid = (a + b) / 2;
            System.out.println("\n\n\na : " + a + "\tb : " + b + "\tMid : " + mid);


            j = 0;
            count = 0;
            minSum = 0;

            for (i = 0; i < nums.length; i++) {
                if (minSum + nums[i] <= mid)
                    minSum += nums[i];

                else {
                    count++;
                    ans[j++] = minSum;
                    System.out.print(minSum + "\t");
                    minSum = nums[i];
                }
            }
            
            ans[j++] = minSum;
            count++;
            System.out.print(minSum + "\t");

            if (count > k) {
                a = a == mid ? a + 1 : mid;
            }

            else if(a==b)
                break;
            
            else
                b = mid;
        }

        max = ans[--j];

        while (j >= 0) {
            if (max < ans[j])
                max = ans[j];

            j--;
        }

        System.out.println("\n" + max);

    }
}
