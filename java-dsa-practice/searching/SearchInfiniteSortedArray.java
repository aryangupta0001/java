public class SearchInfiniteSortedArray {

    static int search(int[] arr, int target, int start, int last) {

        int beg = start, end = last;

        // Approach  1 -->

        /*
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;

            if(arr[mid] == target)
                return mid;
            
            else if(arr[mid] < target)
                beg = mid + 1;
            
            else
                end = mid - 1;
        }

        if(last == arr.length - 1)
            return -1;
        
        else
            return search(arr, target, last + 1, (last * 2) > arr.length - 1 ? arr.length : last * 2);
        
        */

        // Approach 2 --->

        if(target > arr[end])
            return search(arr, target, end + 1, end * 2);
        
        else if(target < arr[beg])
            return -1;

        else{
            while(beg <= start){
                int mid = beg  + (end - beg) / 2;

                if(arr[mid] < target)
                    beg = mid + 1;
                
                else if(arr[mid] == target)
                    return mid;
                
                else
                    end = mid - 1;
            }

            return -1;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 5, 10, 20, 21, 50, 100, 101, 150, 200, 201, 203, 300, 305, 306, 400, 401, 402, 500, 550, 551, 552, 600, 601, 602, 650, 700, 701, 702, 800, 805, 810, 850, 900, 901, 999, 1000, 1001, 1500, 1501, 1502, 2000, 2001, 2002, 2500, 3000, 3001, 3002, 3003, 3500, 3501, 3502, 4000, 4001, 4002, 5000, 5001, 5002,5003, 5004, 5500, 6000, 6001, 6002, 6500, 6501, 7000, 7001, 7500, 8000, 8001, 8500, 9000, 9500, 10000, 11000, 12000, 12001, 15000, 15001, 15002, 16000, 17000, 18000, 19000, 20000, 21000, 22000, 23000, 24000,25000, 26000, 27000, 28000, 29000, 30000, 31000, 32000, 33000 };

        int target = 401;

        int index = search(arr, target, 0, 1);

        System.out.println("Index of " + target + " in the Array is : " + index);
    }
}