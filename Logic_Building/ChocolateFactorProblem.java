
// Problem: The Chocolate Factory ProblemA chocolate factory is packing chocolates into packets. 
// Each packet is represented by an integer in an array. 
// Some packets are empty and are represented by 0. 
// To optimize the conveyor belt, 
// all empty packets (0) must be pushed to the end of the array
//  while maintaining the relative order of the non-empty packets.
//  Input Format:An integer $N$, representing the size of the array.
//  $N$ integers (each on a new line).
//  Constraints:$1 \le N \le 1000$$0 \le Arr[i] \le 100$Output Format:The resulting array with zeroes at the end, 
//  separated by spaces.
//  Example:Input:845019050Output:4 5 1 9 5 0 0 0
//  Edge Case:If the array contains only zeroes,
//   the output remains the same. 
//   If there are no zeroes, the output remains the same.

import java.util.Scanner;

public class ChocolateFactorProblem {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      int[] arr = new int[N];

      for(int i = 0;i<N;i++){
        arr[i] = sc.nextInt();
      }
      int index = 0;
      for(int i =0;i<N;i++){
        if(arr[i] !=0){
            arr[index++] = arr[i];
        }
      }
      while(index <N){
        arr[index++] = 0;
      }
      for(int i = 0;i<N;i++){
        System.out.print(arr[i] + " ");
      }
    }
}
