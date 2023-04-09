
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Task1.task1_main();
                break;
            case 2:
                Task2.task2_main();
                break;
            case 3:
                Task3.task3_main();
                break;
            case 4:
                Task4.task4_main();
                break;
            case 5:
                Task5.task5_main();
                break;
            case 6:
                Task6.task6_main();
                break;
            case 7:
                Task7.task7_main();
                break;
            case 8:
                Task8.task8_main();
                break;
            case 9:
                Task9.task9_main();
                break;
            case 10:
                Task10.task10_main();

        }
    }

    class Task1 {
        public static void task1_main() {
            Scanner sc = new Scanner(System.in); // Create a new Scanner object to read input
            System.out.println("Enter length of an array: ");
            int n = sc.nextInt(); // Read an integer from the user to determine array size
            System.out.println("Enter an array: ");
            int[] arr = new int[n]; // Create an array of size n

            for (int i = 0; i < n; i++) { // Loop through array to read values from the user
                arr[i] = sc.nextInt();
            }

            int min = findMin(arr, n); // Call the findMin method to find the minimum value

            System.out.println("Min is " + min); // Print the minimum value to the console
        }

        /**
         * Problem 1. You are given a number “n” and an array of “n” elements write the function that returns minimum of them.
         *
         * @param arr is an array of integers of which you have to find minimum
         * @param n   is the length of an array
         * @param min is the minimum value of the array which is find by recursive function
         * @return this function returns min
         * @findMin this function finds the minimum of an array recursively
         */

        public static int findMin(int[] arr, int n) {
            if (n == 1) // Base case: if there is only one element in the array, return it
                return arr[0];
            else { // Recursive case: call findMin method with one less element
                int min = findMin(arr, n - 1);
                return Math.min(min, arr[n - 1]); // Compare minimum value found so far with last element
            }
        }
    }

    class Task2 {


        public static void task2_main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of an array: ");
            int n = sc.nextInt(); // Read an integer from the user to determine array size
            System.out.println("Enter an array: ");
            int[] arr = new int[n]; // Create an array of size n
            for (int i = 0; i < n; i++) { // Loop through array to read values from the user
                arr[i] = sc.nextInt();
            }
            double aver = findAver(arr, n);  // call findAver method to find the average
            System.out.println("Average is " + aver);  // prints the average value
        }

        /**
         * Problem 2. You are given a number “n” and an array of “n” elements, write the function that returns average of them.
         *
         * @param arr  is an array of integers of which you have to find average
         * @param n    is the length of an array
         * @param aver is the average of the array which is find by recursive function findAverage
         * @return this function returns average of an array.
         * @findAver this function finds the average of an array recursively
         */

        public static double findAver(int[] arr, int n) {
            if (n == 0)  // base case of the recursive function
                return 0;
            else {
                double sum = findAver(arr, n - 1) * (n - 1); // call findAver recursively to find the sum of array
                sum += arr[n - 1];   // add the last element of the array to the sum
                return sum / n;  // return the average
            }
        }
    }

    class Task3 {

        public static void task3_main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt(); // Read the user's input as an integer
            // Call the isPrime() function to check if the number is prime
            if (isPrime(n, 2)) {
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is Composite");
            }
        }

        /**
         * Problem 3. You are given a number “n”, write the function for checking whether“n” is prime.
         *
         * @param n is the number which we need to check is prime or composite.
         * @param i is the divisor which is being checked.
         * @return this function returns true or false
         * @isPrime this recursive function check if number is prime.
         */

        public static boolean isPrime(int n, int i) {
            if (n <= 1 || n % i == 0) { // 0 and 1 are not prime numbers and if n is divisible by i, n is not prime
                return false;
            }
            if (i > Math.sqrt(n)) { // Base case: if i reaches the square root of n, n is prime
                return true;
            }

            return isPrime(n, i + 1); // Check the next value of i
        }
    }

    class Task4 {
        public static void task4_main() {
            Scanner sc = new Scanner(System.in);  // create scanner to read user input
            System.out.print("Enter a number: ");  // ask the user to enter a number
            int n = sc.nextInt();  // input the variable n
            System.out.println("Factorial of " + n + " is " + findFactorial(n));  // call the function and print the result
        }

        /**
         * Problem 4. You are given a number “n”, write the program using recursion for finding “n!”
         *
         * @param n         is an integer of which you need to find factorial.
         * @param factorial is factorial of the n, which is computed recursively.
         * @return this function returns factorial of n.
         * @findFactorial this recursive function finds the factorial of n.
         */
        public static int findFactorial(int n) {
            if (n == 0 || n == 1)  // check if n is equal to 0 or 1 (base case of the recursive function)
                return 1;  // if so, return 1, because 0! and 1! are both equal to 1
            else {
                int factorial = findFactorial(n - 1) * n;  // calculate factorial recursively, by multiplying previous one with n
                return factorial;  // return the result
            }
        }
    }

    class Task5 {

        public static void task5_main() {
            Scanner sc = new Scanner(System.in);  // create scanner to read user input
            System.out.print("Enter a number: ");  // ask the user to enter a number
            int n = sc.nextInt();  // input the variable n
            System.out.println("Fibonacci is " + findFibonacci(n));  // call the function and print the result
        }

        /**
         * Problem 5.
         * You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion.
         *
         * @param n    is an integer for which you need to find fibonacci.
         * @param fibo is the sum of previous two fibonacci numbers.
         * @return this function returns Fibonacci number.
         * @findFibonacci this recursive function finds the n-th element of Fibonacci sequence
         */
        public static int findFibonacci(int n) {
            if (n == 0 || n == 1)  // check if n is equal to 0 or 1 (base case of the recursive function)
                return n;  // if so, return n, because fibonacci of 0 and 1 equals to itself
            else {
                int fibo = findFibonacci(n - 2) + findFibonacci(n - 1);  // calculate fibonacci recursively, by summing two previous fibonacci numbers
                return fibo;  // return the result
            }
        }
    }

    class Task6 {
        public static void task6_main() {
            Scanner sc = new Scanner(System.in);  // create scanner to read user input
            System.out.print("Enter a numbers: ");  // ask the user to enter a numbers
            int a = sc.nextInt();  // input the variable a
            int n = sc.nextInt();  // input the variable n
            System.out.println(n + " power of " + a + " is " + calculatePower(a, n));  // call the function and print the result
        }

        /**
         * Problem 6. You are given numbers “a” and “n”, write the function that returns “an”.
         *
         * @param a     is an integer which is the base of power.
         * @param n     is an integer which is degree of power.
         * @param power is variable which is multiple of a and recursively calling function with arguments a and n-1.
         * @return this function returns power
         */
        public static int calculatePower(int a, int n) {
            if (n == 0)  // check if n is equal to 0 (base case of the recursive function)
                return 1;  // if so, return n, because zero power of any number is equal to 1
            else {
                int power = a * calculatePower(a, n - 1); // Calculate the power by multiplying a by the result of recursively calling the function with a and n-1 as arguments.
                return power;  // return the result
            }
        }
    }

    class Task7 {

        public static void task7_main() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of an array: ");
            int n = sc.nextInt(); // Read an integer from the user to determine array size
            System.out.println("Enter an array: ");
            int[] arr = new int[n]; // Create an array of size n

            for (int i = 0; i < n; i++) { // Loop through array to read values from the user
                arr[i] = sc.nextInt();
            }

            getReverse(arr, 0, n - 1); // Call the getReverse function to reverse an array
            for (int i = 0; i < n; i++) {   // Create loop to get output
                System.out.print(arr[i] + " ");   // Print the result
            }
        }

        /**
         * Problem 7. You are given a number “n” and an array of “n” elements,
         * write the program that returns given array in reverse order without using array data structure.
         *
         * @param arr    is an array of integers of which you have to find reverse.
         * @param n      is the length of an array
         * @param first1 is first element of an array
         * @param last1  is the last element of an array.
         * @param store  is variable which is used to store the value for swap.
         * @getReverse this function reverse array by replacing last and first elements recursively.
         */


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


    public class Task8 {
        public static void task8_main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            int n = chars.length;
            // Call the function and print yes or no
            if (isDigit(chars, n - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        /**
         * Recursively checks if the characters in the given char array from index 0 to n are digits.
         *
         * @param chars the char array to check
         * @param n     the index of the last character to check
         * @return true if all the characters from index 0 to n are digits, false otherwise
         */

        public static boolean isDigit(char[] chars, int n) {
            if (n < 0) {
                // Base case: if we have checked all characters in the array, return true
                return true;
            } else {
                if (Character.isDigit(chars[n])) {
                    // Recursive case: if the current character is a digit, check the previous character
                    return isDigit(chars, n - 1);
                } else {
                    // Recursive case: if the current character is not a digit, return false
                    return false;
                }
            }
        }
    }

    class Task9 {
        public static void task9_main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a numbers: ");
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println("Binomial coefficent is " + findBinomial(n, k));  // call the function and print the result
        }

        /**
         * @param n is the number of objects in the set
         * @param k the number of objects to choose
         * @return the binomial coefficient C(n, k)
         */

        public static int findBinomial(int n, int k) {
            // Base cases: C(n, 0) = C(n, n) = 1
            if (k == 0 || k == n) {
                return 1;
            } else {
                // Recursive case: use the formula C(n, k) = C(n-1, k-1) + C(n-1, k)
                return findBinomial(n - 1, k - 1) + findBinomial(n - 1, k);
            }
        }
    }


    class Task10 {
        public static void task10_main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("GCD is " + findGCD(a, b));  // call the function and print the result
        }

        /**
         * Problem 10. You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
         *
         * @param a first number of which we need to fin GCD
         * @param b second number of which we need to fin GCD
         * @return the GCD of a and b
         */

        public static int findGCD(int a, int b) {
            if (b == 0) {   // Base case: if b is zero, the GCD is a
                return a;
            } else {
                return findGCD(b, a % b);   // Recursively compute the GCD of b and the remainder of a divided by b.
            }
        }
    }
}

