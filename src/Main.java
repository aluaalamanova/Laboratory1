/**
 *Problem 1. You are given a number “n” and an array of “n” elements write the function that returns minimum of them.
 * @param arr is an array of integers of which you have to find minimum.
 * @param n is the length of an array.
 * @param min is the minimum value of the array which is find by recursive function findMin.
 * findMin this function finds the minimum of an array recursively.
 * return this function returns min.
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

        int min = findMin(arr, n); // Call the findMin method to find the minimum value

        System.out.println("Min is " + min); // Print the minimum value to the console
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) // Base case: if there is only one element in the array, return it
            return arr[0];
        else { // Recursive case: call findMin method with one less element
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]); // Compare minimum value found so far with last element
        }
    }
}
