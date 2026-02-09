import java.util.*;

public class CountPrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];

        System.out.println("Enter " + length + " numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int primeCount = 0;
        System.out.print("Prime numbers in the array: ");

        for (int i = 0; i < length; i++) {
            if (isPrime(arr[i])) {
                primeCount++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\nTotal prime numbers: " + primeCount);

        sc.close();
    }

}