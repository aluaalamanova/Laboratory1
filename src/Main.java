/**
 *Problem 7. You are given a number “n” and an array of “n” elements,
 * write the program that returns given array in reverse order without using array data structure.
 * @param arr is an array of integers of which you have to find reverse.
 * @param n is the length of an array.
 * @param first1 is first element of an array.
 * @param last1 is the last element of an array.
 * @param store is variable which is used to store the value for swap.
 * @getReverse this function reverse array by replasing last and first elements recursively.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a new Scanner object to read input
        int n = sc.nextInt(); // Read an integer from the user to determine array size
        int[] arr = new int[n]; // Create an array of size n

        for (int i = 0; i < n; i++) { // Loop through array to read values from the user
            arr[i] = sc.nextInt();
        }

        getReverse(arr, 0, n-1); // Call the getReverse function to reverse an array
        for (int i = 0; i < n; i++) {   // Create loop to get output
            System.out.print(arr[i] + " ");   // Print the result
        }
    }

    public static void getReverse(int[] arr, int first1, int last1) {
        if (first1 >= last1) {  // If there is 0 or 1 elements it won't be reversed (base case)
            return;
        } else {
            // Swap the elements at start and end indices
            int store = arr[first1];
            arr[first1] = arr[last1];
            arr[last1] = store;
            // Recursively reverse the subarray
            getReverse(arr, first1 + 1, last1 - 1);
        }
    }
}