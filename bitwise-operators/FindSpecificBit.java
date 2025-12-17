public class FindSpecificBit {
    public static void main(String[] args) {
        // Ques. Given two integers, num & k, you need to find out the k'th Bit of num.

        
        // We can find out the Binary Representation of num using LCM & then iterate over it to the k'th position. But it will increase Runtime Complexity.
        
        // We can use Bitwise AND operator, as we know, AND gives 1 if both are 1, else 0
        
        // So on Performing AND Operation of num with an integer (mask) that has 1 on its k'th bit and 0s on all other indices, we will get the k'th bit of the num.
        
        // num = 130
        // Binary Representation :- 10000010
        // nnumber with 1 on k'th bit :- 1000
        //              1   0   0   0   0   0   1   0
        //          &   0   0   0   0   1   0   0   0
        //          =   0   0   0   0   0   0   0   0   =   0, so k'th bit of num is 0
        
        // for k = 2 --->
        //              1   0   0   0   0   0   1   0
        //          &   0   0   0   0   0   0   1   0
        //          =   0   0   0   0   0   0   1   0   =   2, (Not Equal to 0, means there is 1 at k'th Bit)


        // To create this mask integer that has 1 only on its k'th bit, we will use Left Shift Operator.
        // int mask = 1 << (k-1)
        
        int num = 130, k = 2;

        int mask = 1 << (k - 1);

        int ans = num & mask;

        System.out.println(ans > 0  ? 1 : 0);

    }
}
