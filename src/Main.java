/**
 Problem 6. You are given numbers “a” and “n”, write the function that returns “an”.
 * @param a is an integer which is the base of power.
* @param n is an integer which is degree of power.
 * @param power is variable which is multiple of a and recursively calling function with arguments a and n-1.
 * @calculatePower this recursive function finds the n-th power of a.
 * @return this function returns power.
*/
import java.util.Scanner;  // import the Scanner class


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // create scanner to read user input
        System.out.print("Enter a numbers: ");  // ask the user to enter a numbers
        int a = sc.nextInt();  // input the variable a
        int n = sc.nextInt();  // input the variable n
        System.out.println(calculatePower(a,n));  // call the function and print the result
    }

    public static int calculatePower(int a, int n) {
        if (n == 0 )  // check if n is equal to 0 (base case of the recursive function)
            return 1;  // if so, return n, because zero power of any number is equal to 1
        else {
            int power = a * calculatePower(a, n-1); // сalculate the power by multiplying a by the result of recursively calling the function with a and n-1 as arguments.
            return power;  // return the result
        }
    }
} 