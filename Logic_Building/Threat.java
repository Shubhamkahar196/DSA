// public Problem: Single-Digit Threat Sum
// Given a positive integer $N$ and a repetition count $R$. sum all digits of $N$.
//  Repeat this sum action $R$ times by adding the same initial sum to the current total.
//  Finally, decipher the resulting large sum into a single-digit integer by repeatedly summing its digits until only one digit remains.
//   Input Format:An integer $N$.An integer $R$.Constraints:$1 \le N \le 10^9$$0 \le R \le 1000$Output Format:A single digit integer.Example:Input:993
//   Output:9Explanation: Sum of digits of $99 = 9+9 = 18$. Repeating $3$ times: $18 + 18 + 18 = 54$. Summing digits of $54 = 5 + 4 = 9$.
// Edge Case:If $R = 0$, the output must be 0. 



// class ThreatSum {
//     public int singleDigitThreatSum(int N,int R){
//         if(R==0) return 0;

//         int digitSum = 0;
//         while(N>0){
//             digitSum += N %10;
//             N /=10;
//         }
//         int total = digitSum * R;
//         if(total ==0) return 0;
//         return 1 + (total -1) % 9;
//     }
// }

import java.util.Scanner;

public class Threat{

    public static void  main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int R = sc.nextInt();

        if(R==0){
            System.out.println(0);
            return;
        }

        // find the sum of digits of N
        int sum = 0;
        while( n> 0){
            sum += n%10;
            n /=10;
        }
        // multiple by R
        int total = sum * R;

        // reduce to single digit

        while(total >=10){
            int temp = 0;
            while(total > 0){
                temp += total %10;
                total /=10;
            }
            total = temp;
        }

        System.out.println(total);
    }
}