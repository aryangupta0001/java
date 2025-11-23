import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {12, 14, 123, 29, 4, 3, 86, 45, 32, 1, 4, 8, 5, 3};

        for(int i = 1; i<arr.length; i++){
            int j = i-1;
            
            int temp = arr[i];

            while(j>=0 && temp < arr[j])
                arr[j+1] = arr[j--];

            arr[j+1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
