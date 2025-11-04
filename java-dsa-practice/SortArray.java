import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int temp;

        Scanner Sc = new Scanner(System.in);

        for(int i = 0; i<10; i++)
            arr[i] = Sc.nextInt();
        
        Sc.close();

        for(int i = 0; i<10; i++)
            for(int j = 0; j<10-i-1; j++)
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        
        for(int i = 0; i<10; i++)
            System.out.println(arr[i] + "\t");
    }
}