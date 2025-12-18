public class SetBit {
    public static void main(String[] args) {
        // Ques. Set k'th Bit of a number to 1.

        // We cnn conver decimal number to binary and then set k'th bit to 1, then convert it back to Decimal form, but it will increate our Runtime complexity.

        // Another approach is that we can perform Bitwise OR with a mask-number which has 1 on oits k'th bit, and 0 on all other Bits, this way, the k'th bit oof original number will be 1.

        // num = 23, k = 4;

        // 23 = 10111
        // mask = 1000

        //      1   0   1   1   1
        //  |   0   1   0   0   0
        //  =   1   1   1   1   1   =  31

        int num = 23, k = 4;
        int mask  = 1 << (k-1);

        int ans = num | mask;

        System.out.println(ans);

        // To set the Bit to 0, we need to perform Bitwise AND with the mask having 0 on its kth & 1 on its all other bits.
        // To create this mask, we need to create the above mmask (with 1 on k'th bit) and then complement it using Bitwise Compliment operator (~);

        k = 3;
        mask = 1 << (k-1);

        int complimentMask = ~mask;

        System.out.println(num & complimentMask);

    }
}