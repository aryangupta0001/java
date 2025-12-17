public class SingleNumber {
    public static void main(String[] args) {
        // Ques. There is an array that contain some integers, all integers occurs twice except one integer. Find out the number which occurs only once.

        // The solution to this is either we create a hashmap & store count of every no., but it will increase Space Complexity.

        // Another approach is to sort the array, and check which number does not repeat, i.e arr[i] != arr[i+1] for even values of i (0, 2, 4, 6,.... n-1)
        // But this approach will require sorting the array and will increase the Time Complexity.

        // Here we can use XOR Operator to complete this in One single Pass, i.e O(n).

        int[] arr = {1, 2, -1, 2, 0, 5, 4, 4, 6, 5, -1, 3, 1, 0, 6};

        int xor = arr[0];

        for(int i = 1; i<arr.length; i++)
            xor = xor ^ arr[i];

        System.out.println(xor);


        // Since XOR goves zero on same operands, and 1 on different operands, so the integer existing only once will be the final Output of the Loop.

    }
}
