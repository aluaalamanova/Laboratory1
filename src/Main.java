/**
* Problem 4. You are given a number “n”, write the program using recursion for finding “n!”
* @param n is an integer of which you need to find factorial.
 * @param factorial is factorial of the n, which is computed recursively.
 * @findFactorial this recursive function finds the factorial of n.
 * @return this function returns factorial of n.
*/
import java.util.Scanner;  // import the Scanner class


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner to read user input
        System.out.print("Enter a number: ");  // ask the user to enter a number
        int n = sc.nextInt();  // input the variable n
        System.out.println("Factorial of " + n + " is " +findFactorial(n));  // call the function and print the result
    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1)  // check if n is equal to 0 or 1 (base case of the recursive function)
            return 1;  // if so, return 1, because 0! and 1! are both equal to 1
        else {
            int factorial = findFactorial(n - 1) * n;  // calculate factorial recursively, by multiplying previous one with n
            return factorial;  // return the result
        }
    }
} 