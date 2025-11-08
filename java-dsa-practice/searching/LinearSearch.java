public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++)
            if(arr[i] == target)
                return i;
        
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 2, 9, 5, 4, 8, 30};

        int target = 9;

        System.out.println(target + " is present at index : " + linearSearch(arr, target));
    }
}
