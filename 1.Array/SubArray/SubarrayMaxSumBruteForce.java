//Java program to get the maximum sum of the sub arrays in the array 
// by using brute force approach.
public class SubarrayMaxSumBruteForce {
    //Function to get the maximum sum of the sub arrays
    public static void maxSubArraysSum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum += num[k];
                } 
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The maximum sub array sum is - " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10};
        maxSubArraysSum(numbers);
    }
}
