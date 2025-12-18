public class PowerOfTwo {
    public static void main(String[] args) {
        // Ques. Check if a number is power of 2 or not.

        // We can keep dividing the number with two till it is greater than 1, and is even.

        // Another approach is that we can convert that no. into its Binary Representation & check if only 1 of its bit is 1 or not.
        // If no bit is 1, i.e no. is 0 or more than 1 bit is 1, than the no. is not power of 2.

        // The above two approaches will increase the complexity of the program.

        // We can create a mask that contains 1 at all its bit, but 0 only at the bit on which the original no. has 1.
        // Basically we need (n-1).

        // n = 8 --->   1   0   0   0
        // mask --->    0   1   1   1   =   7   (n - 1)

        // Now we willdo Bitwise AND betweeen n & (n-1), If we get 0 as the result, then it (n) is power of 2, else not.


        // 8    =   1   0   0   0
        // 7    =   0   1   1   1
        // &    =   0   0   0   0   =   0 (8 is power of 2)

        int n = 16;
        int mask = n - 1;

        int bitAnd = n & mask;

        System.out.println(bitAnd == 0 ? "Yes" : "No");

    }
}
