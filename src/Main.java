public class Main {
    public static void main(String[] args) {
        int[] arr ={3, 2, 4, 1};  // initialize an array
        double aver = findAver(arr, arr.length);  // call findAver method to find the average
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
