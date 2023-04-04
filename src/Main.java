/**
* Problem 5.
 * You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion.
* @param n is an integer for which you need to find fibonacci.
 * @param fibo is the sum of previous two fibonacci numbers.
 * @findFibonacci this recursive function finds the n-th element of Fibonacci sequence
 * @return this function returns Fibonacci number.
*/
import java.util.Scanner;  // import the Scanner class


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner to read user input
        System.out.print("Enter a number: ");  // ask the user to enter a number
        int n = sc.nextInt();  // input the variable n
        System.out.println("Fibonacci is " +findFibonacci(n));  // call the function and print the result
    }

    public static int findFibonacci(int n) {
        if (n == 0 || n == 1)  // check if n is equal to 0 or 1 (base case of the recursive function)
            return n;  // if so, return n, because fibonacci of 0 and 1 equals to itself
        else {
            int fibo = findFibonacci(n - 2) + findFibonacci(n-1);  // calculate fibonacci recursively, by summing two previous fibonacci numbers
            return fibo;  // return the result
        }
    }
} 