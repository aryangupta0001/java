import java.util.Scanner;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        Scanner Sc = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            arr[i] = Sc.nextInt();

            if(max1<arr[i]){
                max2 = max1;
                max1 = arr[i];
            }

            else if (max2 < arr[i])
                    max2 = arr[i];
        }

        Sc.close();
        
        System.out.println(max2);
    }
}
