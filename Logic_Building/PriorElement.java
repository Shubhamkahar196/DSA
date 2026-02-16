// Problem: Prior Element Count
// Given an integer array of size $N$, find the count of elements that are strictly greater than all the elements appearing before them in the array.
//  The first element is always included in the count as it has no prior elements. 
//  Input Format:An integer $N$ (size of array).$N$ integers (array elements) on new lines.
//  Constraints:$1 \le N \le 20$$1 \le Arr[i] \le 10000$Output Format:A single integer representing the count.
//  Example:Input:574829Output:3Explanation: Elements are 7, 8, and 9. 7 is first. 
//  8 is $> 7$ and $4$. 9 is $> 7, 4, 8,$ and $2$.
//  Edge Case:If the array is strictly decreasing (e.g., 5, 4, 3, 2, 1), the output is 1.





public class PriorElement {
      
    public int priorElementCount(int[] arr){
        int count = 1; //first elemet 
        int maxSoFar = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxSoFar){
                count++;
                maxSoFar = arr[i];
            }
        }
        return count;
    }
}
