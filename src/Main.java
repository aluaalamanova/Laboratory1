public class Main {
    public static void main(String[] args) {
        int[] arr ={3, 2, 4, 1};

        double aver = findAver(arr, arr.length);
        System.out.println("Average is " + aver);
    }

    public static double findAver(int[] arr, int n){
        if(n==0)
            return 0;
        else{
            double sum = findAver(arr, n-1)*(n-1);
            sum+=arr[n-1];
            return sum/n;
        }

    }
}