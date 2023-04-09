# Task1
### Description:
Return the minimum value of the given array.
### Explanation:
Base case: n=1 if there is 1 element in array, return it, in other case  the function recursively calls itself with a smaller array of size n-1 and compares the result with the last element of the original array to find the minimum value.
### Solution:
```
public static int findMin(int[] arr, int n) {
            if (n == 1) 
                return arr[0];
            else { 
                int min = findMin(arr, n - 1);
                return Math.min(min, arr[n - 1]);
            }
        }
 ```      
# Task2
### Description:
Return the average of the given array.
### Explanation:
Base case: n==0 if there is no element, it returns 0, in other case it recursively calls itself with a smaller array of size n-1 to find the sum of the first n-1 elements, adds the last element of the array, and returns the average by dividing the total sum by n.
### Solution:
```
public static double findAver(int[] arr, int n) {
            if (n == 0) 
                return 0;
            else {
                double sum = findAver(arr, n - 1) * (n - 1); 
                sum += arr[n - 1];   
                return sum / n; 
            }
        }
```        
# Task3
### Description:
Return true if the given number is prime, false if it's not.
### Explanation:
The function returns false if n is less than or equal to 1, or if n is divisible by i. It returns true if divisor reaches the square root of n. The function uses recursion by calling itself with the next value of divisor until the base case is reached or false is returned.
```
public static boolean isPrime(int n, int i) {
            if (n <= 1 || n % i == 0) { 
                return false;
            }
            if (i > Math.sqrt(n)) { 
                return true;
            }

            return isPrime(n, i + 1); 
        }
 ```       
# Task4
### Description:
Return factorial of the given number.
### Explanation:
Base case: if n=0 or n=1 return 1, since 0! and 1! are equal to 1, in other case recursively multiply n by factorial of n-1 and return the result.
```
public static int findFactorial(int n) {
            if (n == 0 || n == 1)  
                return 1;  
            else {
                int factorial = findFactorial(n - 1) * n;  
                return factorial; 
            }
        }
```     
# Task5
### Description:
Return n-th element in fibonacci sequence.
### Explanation:
Base case: if n=0 or n=1 it returns n, in other case it recursively returns the sum of two previous elements. The function continues to call itself recursively until it reaches one of the base cases, and then it returns the final result.
```
public static int findFibonacci(int n) {
            if (n == 0 || n == 1)  
                return n; 
            else {
                int fibo = findFibonacci(n - 2) + findFibonacci(n - 1); 
                return fibo; 
            }
        }
```
# Task6
### Description:
Return n-th power of a.
### Explanantion:
Base case: if n=0 return 1, since 0 power of any number is 1, in other case it recursively multiply a by (n-1)th power of a.
### Solution:
```
public static int calculatePower(int a, int n) {
            if (n == 0)  
                return 1; 
            else {
                int power = a * calculatePower(a, n - 1); 
                return power; 
            }
        }
```
# Task7
### Description: 
Return array in reversed order.
### Explanation:
Base case: if there i 0 or 1 element it won't be reversed, in other case it swap the last and first elements of an array recursively.
### Solution:
```
public static void getReverse(int[] arr, int first1, int last1) {
            if (first1 >= last1) { 
                return;
            } else {
                int store = arr[first1];
                arr[first1] = arr[last1];
                arr[last1] = store;
                getReverse(arr, first1 + 1, last1 - 1);
            }
        }
```
# Task8
### Description:
Returns true if the given string consist only of digits, otherwise returns false.
### Explanation:
Base case: if our string is empty return true. It checks each character in the array one by one, starting from the end, and returns true if all characters are digits, otherwise false.
### Solution:
```
 public static boolean isDigit(char[] chars, int n) {
            if (n < 0) {
                return true;
            } else {
                if (Character.isDigit(chars[n])) {
                    return isDigit(chars, n - 1);
                } else {
                    return false;
                }
            }
        }
```
# Task9
### Description:
Return binomial coefficient.
### Explanation:
Base case: if k=0 or k=n returns 1, in other case the function recursively calls itself to calculate the binomial coefficient. It does this by using the formula C(n, k) = C(n-1, k-1) + C(n-1, k), which states that the binomial coefficient of choosing k objects from a set of n objects is equal to the sum of the binomial coefficient of choosing k-1 objects from a set of n-1 objects and the binomial coefficient of choosing k objects from a set of n-1 objects.
### Solution:
```
 public static int findBinomial(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            } else {
                return findBinomial(n - 1, k - 1) + findBinomial(n - 1, k);
            }
        }
```
# Task10
### Description:
Return GCD of the given 2 numbers.
### Explanation:
Base case: if b=0 it returns a because GCD of a and 0 is a, in other case the function calculates the remainder of a divided by b using the % operator. This is done because the GCD of a and b is the same as the GCD of b and the remainder of a divided by b.
### Solution 
```
public static int findGCD(int a, int b) {
            if (b == 0) {   // Base case: if b is zero, the GCD is a
                return a;
            } else {
                return findGCD(b, a % b);   // Recursively compute the GCD of b and the remainder of a divided by b.
            }
        }
```
