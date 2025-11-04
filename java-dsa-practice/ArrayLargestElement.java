import java.util.Scanner;

public class ArrayLargestElement {
    public static void main(String[] args){
        int[] arr = new int[10];
        int i, max = 0;
        Scanner Sc = new Scanner(System.in);

        for(i = 0; i<10; i++){
            arr[i] = Sc.nextInt();

            if(max < arr[i])
                max = arr[i];
        }

        Sc.close();
        System.out.println(max);
    }    
}
