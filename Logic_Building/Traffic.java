// Problem: Traffic Fine Calculation
// To combat pollution, a city uses an Odd-Even rule for vehicles. 
// Vehicles with odd last digits are allowed on odd dates, and even digits on even dates.
//  Violators are fined an amount $X$. 
//  Given a date $D$, an array of $N$ registration last digits, and fine amount $X$, calculate the total fine collected. 
//  Input Format:An integer $N$ (number of vehicles).$N$ integers (last digit of registration) on new lines.
//  An integer $D$ (date).An integer $X$ (fine per vehicle).Constraints:$1 \le N \le 1000$$1 \le D \le 31$$1 \le X \le 1000$
//  Output Format:A single integer representing the total fine.Example:Input:4523712100
//  Output:300Explanation: Date is 12 (even). Only even digits are allowed. Digits {5, 3, 7} are odd and violate the rule. 
//  Total fine = $3 \times 100 = 300$.Edge Case:If no vehicles violate the rule, the output is 0.

class Traffic {
    public int totalFine(int N, int[] digits, int D, int X) {
             
        int violations = 0;
        
        for (int i = 0; i < N; i++) {
            
            // If date is even, odd digits violate
            if (D % 2 == 0 && digits[i] % 2 != 0) {
                violations++;
            }
            
            // If date is odd, even digits violate
            else if (D % 2 != 0 && digits[i] % 2 == 0) {
                violations++;
            }
        }
        
        return violations * X;
    }
}

