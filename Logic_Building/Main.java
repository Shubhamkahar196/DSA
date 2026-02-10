import java.util.*;

public class Main {
    public static void findLongestIncreasingSubarray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Length: 0");
            return;
        }
        
        int maxLen = 1;
        int currLen = 1;
        int endIndex = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                    endIndex = i;
                }
            } else {
                currLen = 1;
            }
        }
        
        System.out.println("Length: " + maxLen);
        System.out.print("Subarray: ");
        for (int i = endIndex - maxLen + 1; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 2, 3};
        findLongestIncreasingSubarray(arr);
    }
}