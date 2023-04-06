/**
 *Problem 2. You are given a number “n” and an array of “n” elements, write the function that returns average of them.
 * @param arr is an array of integers of which you have to find average.
 * @param n is the length of an array.
 * @param aver is the average of the array which is find by recursive function findAverage.
 * @findMin this function finds the average of an array recursively.
 * @return this function returns average.
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
        double aver = findAver(arr, n);  // call findAver method to find the average
        System.out.println("Average is " + aver);  // prints the average value
    }

    public static double findAver(int[] arr, int n){
        if(n==0)  // base case of the recursive function
            return 0;
        else{
            double sum = findAver(arr, n-1)*(n-1); // call findAver recursively to find the sum of array
            sum+=arr[n-1];   // add the last element of the array to the sum
            return sum/n;  // return the average
        }
    }
}
