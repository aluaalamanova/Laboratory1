/**
 *Problem 2. You are given a number “n” and an array of “n” elements, write the function that returns average of them.
 * @param n is the number which we need to check is prime or composite.
 * @param i is the divisor which is being checked.
 * @isPrime this recursive function check if number is prime.
 * @return this function returns true or false.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read the user's input as an integer
        // Call the isPrime() function to check if the number is prime
        if (isPrime(n, 2)) {
            System.out.println(n + "Prime");
        } else {
            System.out.println(n + "Composite");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 1 || n % i == 0) { // 0 and 1 are not prime numbers and if n is divisible by i, n is not prime
            return false;
        }
        if (i > Math.sqrt(n)) { // Base case: if i reaches the square root of n, n is prime
            return true;
        }

        return isPrime(n, i+1); // Check the next value of i
    }
}