// Problem: Bit Toggling ProblemJoseph is learning digital logic.
//  He is given a positive integer $N$. 
//  He needs to convert it to binary, toggle all its bits (change 0 to 1 and 1 to 0),
//   and then print the resulting decimal integer.
//   Input Format:A single positive integer $N$.Constraints:$1 \le N \le 100$
//   Output Format:A single positive integer.
//   Example:Input:10Output:5Explanation:10 in binary is 1010. 
//   Toggling all bits results in 0101, which is 5 in decimal.
// Edge Case:If $N=1$, binary is 1, toggle is 0, output is 0.

import java.util.Scanner;

public class BitToggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // Find bit length L
        int L = Integer.toBinaryString(N).length();

        // All 1's in binary of length L
        int allOnes = (1 << L) - 1;

        // Toggled value
        int result = allOnes - N;

        System.out.println(result);
    }
}